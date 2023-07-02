package rw.programming;

import java.util.Scanner;

public class Exercise1 {

  public static void main(String[] args) {
    System.out.println("How old are you");
    Scanner sc = new Scanner(System.in);

    int age = Integer.parseInt(sc.nextLine());

    // Using the if statement check whether the user is legally allowed to drink alcohol, age >= 18
    // If age greater or equal to 18 print "Great you can have a drink"

    // Follow up. Modify the code to show a message to the user if age is smaller than 18
  }

}
