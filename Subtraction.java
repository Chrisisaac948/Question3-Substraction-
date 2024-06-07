
package vu.quest3sub;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
       
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);


        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

 
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int studentAnswer = scanner.nextInt();


        int correctAnswer = number1 - number2;
        if (studentAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry, the correct answer is " + correctAnswer);
        }
    }
}