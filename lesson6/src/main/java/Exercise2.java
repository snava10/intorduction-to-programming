import java.util.Scanner;

/**
 * This program asks the user to enter a list of numbers, stores them in an array of int
 *
 */
public class Exercise2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements.");

    int n = Integer.parseInt(sc.nextLine());

    // TODO:: Create an array of int of length n
    // int [] arr;

    System.out.println("Type " + n + " numbers, one per line");

    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(sc.nextLine());
      // TODO:: save the value of x in the array arr in position i
    }

    int max = 0;
    int min = 0;
    int sum = 0;

    // TODO:: Write the code to find the maximum, minimum, sum and average of the list of number entered by the user.
    // Hint:: Use a for loop similar to that of line 16 and variables max, min and sum to keep the results.

    System.out.println("Max: " + max);
    System.out.println("Max: " + min);
    System.out.println("Max: " + sum);

  }

}
