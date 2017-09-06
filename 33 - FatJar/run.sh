# Move into correct directory
cd DogDatabase

# Build the package with the new jar plugin added (See POM.xml)
mvn package

# Run the jar without adding item to the class apth
java -jar target/DogDatabase-1.0-SNAPSHOT.jar
