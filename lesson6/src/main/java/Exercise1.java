import java.util.Scanner;

/**
 * A palindrome is a word that reads the same from left to right than from right to left.
 * For example, ana, radar, level, rotor, madam
 * This program asks the user for a word and prints Palindrome if it is a palindrome, Not Palindrome otherwise.
 *
 * This exercises is aimed at students working with Strings and while loops.
 * They will learn how to treat strings as arrays, getting its length and accessing characters at specific positions.
 * It also showcases the ability of breaking down a complex problem into smaller, easier ones.
 */
public class Exercise1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type a word");
    String word = sc.nextLine();

    // TODO: Write the code to check if the word is a palindrome
    // Hint use a while loop with two integer pointers one from the beginning and one from the end

    int start = 0;
    // TODO: Initialise end to be pointing at the last letter of the word.
    int end = 0;

    // TODO:: Modify the wile loop condition to guarantee the code finishes.
    while (true) {
      // TODO:: Complete the code to check whether the word is a palindrome.
    }

  }

}
