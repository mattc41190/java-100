package org.cats.dogdatabase;
import java.util.Scanner;
import mjson.Json;

public class DogsDatabase {
    static Scanner input = new Scanner(System.in);
    public final Json dogs = Json.object();
    public Integer id = 0;

    public void add() {
        Prompter.prompt("Name");
        String name = input.next();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        dogs.set(String.valueOf(id), name);
        id = id + 1 ;
        System.out.println(String.format("Added: %s", name));
    }

    public void find(){
        Prompter.prompt("ID");
        String id = input.next();
        String dog = dogs.at(String.valueOf(id)).asString();
        System.out.println(dog);
    }

    public void remove(){
        Prompter.prompt("ID");
        String id = input.next();
        dogs.delAt(String.valueOf(id));
        System.out.println("Removed");
    }


    public void browse(){
        System.out.println(dogs.toString());
    }

}
