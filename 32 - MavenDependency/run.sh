cd dependencyChecker
mvn clean package

java -cp target/dependencyChecker-1.0-SNAPSHOT.jar:/Users/mcale/.m2/repository/org/sharegov/mjson/1.4.1/mjson-1.4.1.jar dependencyChecker.app.App
