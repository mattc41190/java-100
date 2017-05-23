package clock;

import mjson.Json;


public class Main {
   public static void main(String [] args) {
       Clocker c = new Clocker();
       c.tellTime();

       Json coolAnimal = Json.object().set("name", "wolf")
                             .set("gender", "male")
                             .set("age", 0.0)
                             .set("moves", Json.array("run", "bite"));

       String coolAnimalString = coolAnimal.toString();
       coolAnimal.equals(Json.read(coolAnimalString));
       System.out.println(coolAnimalString);
   }
}
