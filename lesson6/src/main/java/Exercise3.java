import java.util.List;
import java.util.Scanner;

/**
 * This program helps you remember all countries you have visited
 * It will allow the user to add new countries, know the number of different countries visited and
 * check whether they visited a specific country already.
 *
 * The students will practice working with Lists
 **/
public class Exercise3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // TODO:: Modify the line below to initialise the list that will hold the countries.
    List<String> countries = null;

    while (true) {
      String option = sc.nextLine();
      if (option.equals("exit")) {
        break;
      }

      if (option.equals("a")) {
        System.out.println("Type the name of the country you visited");
        String country = sc.nextLine();
        // TODO:: Add the country to the list of visited countries.
      } else if (option.equals("c")) {
        // TODO:: Modify the line below to get the number of visited countries.
        int visited = 0;
        System.out.printf("You have visited %d countries %n", visited);
      } else if (option.equals("f")) {
        System.out.println("Type the name of the country you want to check is in the list");
        String country = sc.nextLine();
        // TODO:: Modify the code below to check if the country has been visited
        // Hint: use the contains method of the list.
        boolean visited = false;

        if (visited) {
          System.out.printf("You already visited %s %n", country);
        } else {
          System.out.printf("You have yet to visit %s %n", country);
        }
      } else if (option.equals("l")) {
        // TODO:: Write the code below to print all the countries the user has visited.
        // Hint make use of the foreach loop instead of the for loop

        // TODO:: bonus, print them in alphabetical order. Hint: use the sort method of the list, when asked for a comparator use String::compareTo
        
      }

    }

    System.out.println("Exit");

  }

}
