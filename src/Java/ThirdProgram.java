package Java;

import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Length: " + sentence.length());
        System.out.println("First character: " + sentence.charAt(0));


    }
}
