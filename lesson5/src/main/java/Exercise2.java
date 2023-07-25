import java.util.Scanner;

public class Exercise2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      System.out.println("Type a number or exit to terminate");
      String input = sc.nextLine();
      if (input.equals("exit")) {
        break;
      }
      double first = Double.parseDouble(input);
      System.out.println("Enter the operation (+ , - , * , /)");
      char operation = sc.nextLine().charAt(0);
      System.out.println("Type a number");
      double second = Double.parseDouble(sc.nextLine());

      if (operation == '+') {
        System.out.println(first + second);
      } else if (operation == '-') {
        System.out.println(first - second);
      } else if (operation == '*') {
        System.out.println(first * second);
      } else if (operation == '/') {
        if (second == 0) {
          System.out.println("Sorry, I can't divide by zero");
          return;
        }
        System.out.println(first / second);
      } else {
        System.out.println("Wrong operation");
      }
    }
    sc.close();
    System.out.println("Closing the application");
  }


}
