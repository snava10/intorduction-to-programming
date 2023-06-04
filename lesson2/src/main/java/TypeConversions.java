import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TypeConversions {

  public static void main(String[] args) {
    // Introducing the System library.
    long start = System.currentTimeMillis();
    Scanner in = new Scanner(System.in);
    System.out.println("Type an integer and press enter");
    String input = in.nextLine();
    int i = Integer.parseInt(input);
    System.out.println("Str to int: " + i);

    System.out.println("Type a float and press enter");
    input = in.nextLine();
    float f = Float.parseFloat(input);
    System.out.println("Str to float: " + f);

    // The students to do the long and the double.

    // Introducing the Math library
    System.out.println(Math.floor(f));
    System.out.println(Math.nextDown(f));

    // Round up the double.
    // What happen if input a 1000 as the integer and try to compute i^100000
    System.out.println(Math.pow(i, 10000));

    // Introduce casting
    // Print the integer and decimal parts of the float
    int fi = (int)f;
    System.out.printf("Integer part: %d%n", fi);
    System.out.printf("Decimal part: %f%n", f - fi);

    // Repeat the exercise using the long and double instead.

    // Chars
    System.out.println("Input a single character");
    input = in.nextLine();
    char c = input.charAt(0);
    // Convert char to int. Talk about how every key has a number associated with it. ASCII
    System.out.printf("Char %c has the ASCII value %d. The next char in the ASCII is %c%n", c, (int)c, c + 1);
    // try inputting a number. Char numbers are just chars, and different from the value they represent.

    System.out.println("I'm having a blast learning to program, true or false?");
    input = in.nextLine();
    boolean b = Boolean.parseBoolean(input);
    System.out.printf("Is %b that I enjoy programming%n", b);
    System.out.println("Converting this boolean back to string: " + Boolean.toString(b));

    // Reading dates. Talk about the toString and how complex is to deal with dates and timezones.
    // Implement how old are you
    System.out.println("Enter your date of birth in the format YYYY-mm-dd");
    input = in.nextLine();
    LocalDate date = LocalDate.parse(input, DateTimeFormatter.ISO_DATE); //YYYY-mm-dd
    LocalDate now = LocalDate.now();
    int age = now.getYear() - date.getYear() - (date.getDayOfYear() > now.getDayOfYear() ? 1 : 0);
    System.out.printf("You are %d years old%n", age);
    System.out.println(date);

    System.out.printf("The program was running for %d milliseconds%n", System.currentTimeMillis() - start);
  }

}
