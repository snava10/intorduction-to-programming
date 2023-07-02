package rw.programming;

import java.util.Scanner;

/**
 * Print "leap year" if the year is a leap year, "not leap year" otherwise
 */
public class Exercise4 {

  public static void main(String[] args) {
    System.out.println("Enter the year");
    Scanner sc = new Scanner(System.in);
    int year = Integer.parseInt(sc.nextLine());

    if (year % 4 != 0) {
      System.out.println("Not leap year");
    } else if (year % 100 != 0) {
      System.out.println("Leap year");
    } else if (year % 400 == 0) {
      System.out.println("Leap year");
    } else {
      System.out.println("Not leap year");
    }
  }

}
