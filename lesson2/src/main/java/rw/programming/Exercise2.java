package rw.programming;

import java.util.Scanner;

public class Exercise2 {

  public static void main(String[] args) {
    long time = System.currentTimeMillis();
    // Read two integer numbers and print the sum
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    String fnText = sc.nextLine();
    System.out.println("Enter the first number");
    String snText = sc.nextLine();
    int sum = Integer.parseInt(fnText) + Integer.parseInt(snText);
    System.out.println(sum);
    long elapsed = System.currentTimeMillis() - time;
    System.out.println("Execution time " + elapsed);
  }

}
