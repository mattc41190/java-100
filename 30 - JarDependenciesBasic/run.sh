# Compile sources

javac -cp '.:mjson.jar' -d . *.java

# Create JAR
# Note that the manifest and the shell scripts work in conjunction quite a bit
# https://docs.oracle.com/javase/tutorial/deployment/jar/downman.html

jar cfm \
clock.jar \
Manifest.txt \
clock/*.class

java -jar clock.jar
