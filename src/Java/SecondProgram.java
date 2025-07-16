package Java;

import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNum = scanner.nextInt();
        System.out.print("Enter second number: ");
        double secondNum = scanner.nextInt();
        System.out.println("Sum = "+ (firstNum + secondNum));
        System.out.println("Difference = "+ (firstNum - secondNum));
        System.out.println("Product = "+ (firstNum * secondNum));
        System.out.println("Quotient = "+ (firstNum / secondNum));




    }
}
