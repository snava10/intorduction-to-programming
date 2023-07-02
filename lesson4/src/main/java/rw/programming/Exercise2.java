package rw.programming;

import java.util.Scanner;

/**
 * This program works as a simple calculator
 */
public class Exercise2 {

  public static void main(String[] args) {
    System.out.println("Type a number");
    Scanner sc = new Scanner(System.in);
    double first = Double.parseDouble(sc.nextLine());
    System.out.println("Enter the operation (+ , - , * , /)");
    char operation = sc.nextLine().charAt(0);
    System.out.println("Type a number");
    double second = Double.parseDouble(sc.nextLine());

    if (operation == '+') {
      System.out.println(first + second);
    }
    // TODO: Complete the code to implement the operations substraction, multiplication and division
  }

}
