package Java;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your favorite programming language: ");
        String favLang = scanner.nextLine();
        int ageInMonths = age * 12;
        System.out.println("Hello! My name is " + name);
        System.out.println("I am " + age + "years old, which is " + ageInMonths + " months");
        System.out.println("My favorite programming language is " + favLang);
        System.out.println("Next year I will be  " + ++age + " years old");

    }
}
