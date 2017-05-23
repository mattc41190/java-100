# Compile sources

javac -cp '.:dependencies/mjson.jar' -d . *.java

# Create JAR
# Note that the manifest and the shell scripts work in conjunction quite a bit
# https://docs.oracle.com/javase/tutorial/deployment/jar/downman.html

jar cfm \
simpledb.jar \
Manifest.txt \
simpledb/*.class

java -jar simpledb.jar
