package rw.programming;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataTypesExamples {

  public static void main(String[] args) {
    int i = Integer.MAX_VALUE;
    long l = Long.MAX_VALUE;
    float f = Float.MAX_VALUE;
    double d = Double.MAX_VALUE;
    boolean b = true;
    char c = 'A';
    String s = "This is a text";

    System.out.printf("These are the different primitive data types: %n"
        + "Integer: %d%n"
        + "Long: %d%n"
        + "Float: %f%n"
        + "Double: %f%n"
        + "Boolean: %s%n"
        + "Char: %c%n"
        + "String: %s%n", i, l, f, d, b, c, s);

    LocalDate localDate = LocalDate.now();
    LocalDateTime localDateTime = LocalDateTime.now();

    System.out.println("Date: " + localDate);
    System.out.println("Date Time: " + localDateTime);
  }

}
