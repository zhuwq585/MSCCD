
from os import times


class AnalysisController():
    def __init__(self):
        pass

    def pair(self, pairsArr, bagCollectionArr):
        self.pairsArrSort(pairsArr)
        for pair in pairsArr:
            similarity, overlap = self.simiCalculation(bagCollectionArr[pair[0][0]][pair[0][1]],bagCollectionArr[pair[1][0]][pair[1][1]])
            pair.append(similarity)
            pair.append(overlap)

    
    def simiCalculation(self, bagA, bagB):
        overlap = 0
        tokenDictA = bagA.tokens
        tokenDictB = bagB.tokens

        for token, times in tokenDictA.items():
            try:
                timesB = tokenDictB[token]
                tmp = times if times <= timesB else timesB
                overlap = overlap + tmp
            except KeyError:
                pass
        
        maxLength = bagA.tokenNum if bagA.tokenNum >= bagB.tokenNum else bagB.tokenNum
        similarity = round(overlap / int(maxLength) , 4)
        return(similarity,overlap)

    def pairsArrSort(self, pairsArr):
        pairsArr = sorted(pairsArr, key=(lambda x:x[0][0]))