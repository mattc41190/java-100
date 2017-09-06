sh clean.sh
sh package.sh

cd helloworld
java -cp target/helloworld-1.0-SNAPSHOT.jar mcale.helloworld.app.App
