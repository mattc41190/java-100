package org.cats.dogdatabase;
import java.util.Scanner;

public class App
{
    public static Scanner input = new Scanner(System.in);
    public static boolean using = true;
    public static DogsDatabase dogsDatabase = new DogsDatabase();

    public static void main( String[] args ) {
        Prompter.welcome();
        while(using){
            Prompter.displayChoices();
            Prompter.prompt("Choice");
            String choice = input.next();
            choose(choice);
        }
    }

    public static void choose(String choice){
        if (choice.equals("Add") || choice.equals("add") || choice.equals("a")) {
            dogsDatabase.add();
        } else if (choice.equals("Remove") || choice.equals("remove") || choice.equals("x")) {
            dogsDatabase.remove();
        } else if (choice.equals("Find") || choice.equals("find") || choice.equals("f")) {
            dogsDatabase.find();
        } else if (choice.equals("Browse") || choice.equals("browse") || choice.equals("b")) {
            dogsDatabase.browse();
        } else if (choice.equals("Exit") || choice.equals("exit") || choice.equals("e")) {
            using = false;
        } else {
            System.out.println("No matching choices. Please try again.");
        }
    }
}
