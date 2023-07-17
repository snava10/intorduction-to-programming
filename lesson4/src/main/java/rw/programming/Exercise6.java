package rw.programming;

import java.util.Scanner;

public class Exercise6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type a number between 0 and 100");
    int n = Integer.parseInt(sc.nextLine());

    if (n % 2 == 0) {
      System.out.println("Not Prime");
    }

    // Complete the exercise ...
  }

}
