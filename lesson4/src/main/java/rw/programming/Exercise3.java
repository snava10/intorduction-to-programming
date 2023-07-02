package rw.programming;

import java.util.Scanner;

/**
 * Triangular inequality
 */
public class Exercise3 {

  public static void main(String[] args) {
    System.out.println("Type three numbers corresponding to the lengths of the sides of a triangle");
    Scanner sc = new Scanner(System.in);
    double a = Double.parseDouble(sc.nextLine());
    double b = Double.parseDouble(sc.nextLine());
    double c = Double.parseDouble(sc.nextLine());

    if (true) { // Complete the condition to determine whether a,b and c can form a triangle.
      System.out.println("Triangle");
    } else {
      System.out.println("Not triangle");
    }
  }

}
