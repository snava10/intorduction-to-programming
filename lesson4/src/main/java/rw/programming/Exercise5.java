package rw.programming;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise5 {

  public static void main(String[] args) {
    System.out.println("Type a date in the format YYYY-mm-dd");
    Scanner sc = new Scanner(System.in);
    LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ISO_DATE);
    LocalDate newYearsDate = LocalDate.of(2023, 1, 1);

    // Modify the code below to check for all the remaining UK bank holidays.
    if (date.equals(newYearsDate)) {
      System.out.println("Bank Holiday");
    } else {
      System.out.println("Not Bank Holiday");
    }
  }

}
