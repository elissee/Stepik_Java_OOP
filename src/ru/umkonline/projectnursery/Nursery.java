
package ru.umkonline.projectnursery;

import java.util.Scanner;

public class Nursery {

    public static void addNewDog(int i, Dog[] dogs) {
        Scanner in = new Scanner(System.in);
        String breed, size, color;
        int age;
        System.out.println("Enter breed:");
        breed = in.nextLine();
    }

    public static void main(String[] args) {



        System.out.println("Nursery project");
        Scanner in = new Scanner(System.in);
        String command;

        Dog[] dogs = new Dog[10];
        int count = 0;
        // считываем команды от пользователя: add, list, exit

        while (true) {
            command = in.nextLine();
            switch(command) {
                case "add":
                    System.out.println("Add new dog");
                    addNewDog(count, dogs);
                    count++;
                    break;
                case "list":
                    System.out.println("Show all dogs");
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("command:" + command);
            }
        }
    }
}

/*Dog mastif = new Dog();

        mastif.breed = "Neapolitan Mastiff";
        mastif.size = "large";
        mastif.age = 5;
        mastif.color = "black";

        System.out.println("First dog: " + mastif.breed + ", " + mastif.age + ", " + mastif.color);

        Dog maltese = new Dog("Maltese", "small", 2, "white");

        System.out.println("Second dog: " + maltese.breed + " " + maltese.age + " " + maltese.color);*/