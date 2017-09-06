package org.cats.dogdatabase;

public class Prompter {

    public static void welcome(){
        System.out.println("Welcome to the Enemies of the Cat State Database.");
    }

    public static void displayChoices(){
        System.out.println("Please select an action: 'Add', 'Find', 'Remove', 'Browse', 'Exit' ");
    }

    public static void prompt(String preface){
        System.out.print(String.format("%s -> ", preface));
    }

}
