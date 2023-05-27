/*
 * This program uses a while loop
 *
 * @author  Mr Coxall
 * @version 1.0
 * @since   2020-09-01
 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // this function uses a while loop

    // create Scanner object for user input
    Scanner scanner = new Scanner(System.in);

    int counter = 0;

    // input
    System.out.print("Enter how many times to repeat: ");
    String positiveIntegerStr = scanner.nextLine();
    System.out.println();

    // process & output
    int positiveInteger = Integer.parseInt(positiveIntegerStr);

    while (counter < positiveInteger) {
      System.out.println("%d time(s) through the loop.".formatted(counter));
      counter = counter + 1;
    }

    // close the Scanner object
    scanner.close();
    System.out.println("\nDone.");
  }
}
