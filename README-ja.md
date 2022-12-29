# MSCCD

## Developing

### Setup with devcontainer

devcontainerを使って環境を構築することが出来ます．

### Tokenizerの生成

```
poetry run python ./tokenizerGeneration2.py --name CPP14
```

`tokenizerManifests.json`に記載されているキーを`--name`で指定してください．
