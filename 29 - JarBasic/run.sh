# For previous versions of execution
javac -d . *.java
# java clock.Main

# The c option indicates that you want to create a JAR file.
# The f option indicates that you want the output to go to a file rather than to stdout.
# We create a suitable jar name
# We specify a Manifest containing our entry point
# We specify a -C (change in directory) to the classes we want to compile
jar cfm \
clock.jar \
Manifest.txt \
clock/*.class

java -jar clock.jar
