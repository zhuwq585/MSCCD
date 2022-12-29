# Maven
mvn install:install-file \
  -Dfile=./lib/antlr-4.8-modified.jar \
  -DgroupId=org.nagoya_u.ertl.sa \
  -DartifactId=antlr-v4.8-modified \
  -Dversion=4.8 \
  -Dpackaging=jar

# Poetry
curl -sSL https://install.python-poetry.org | python3 -
poetry install
