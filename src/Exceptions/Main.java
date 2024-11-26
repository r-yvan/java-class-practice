package Exceptions;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Enter Your Age: ");
      int java = scanner.nextInt();
      if (java < 18) {
        throw new ArithmeticException("Your are not eligible to vote, wait until 18 or over!!");
      } else {
        System.out.println("You are allowed to vote!!");
      }
    }
    catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}
