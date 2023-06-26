package rw.programming;

import java.util.Scanner;

public class Exercise5 {

  public static void main(String[] args) {
    System.out.println("Type a single character to see its ASCII value");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    char c = input.charAt(0);

    // TODO
    // Convert the character into its ASCII value by casting it to int.
    int asciiValue = 0; // Replace 0 with the code to cast c into an integer value.
    System.out.println("ASCII value is: " + asciiValue);
  }

}
