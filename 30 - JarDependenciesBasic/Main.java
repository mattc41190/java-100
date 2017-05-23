package simpledb;

import mjson.Json;

public class Main {
   public static void main(String [] args) {
       Json db = Json.object();
       Json coolAnimal = Json.object().set("species", "wolf")
                             .set("gender", "male")
                             .set("age", 0.0)
                             .set("moves", Json.array("run", "bite"));

        db.set("Jeff", coolAnimal);

       String dbString = db.toString();
       DbWriter dbWriter = new DbWriter();
       dbWriter.writeDbToFile(dbString);
   }
}
