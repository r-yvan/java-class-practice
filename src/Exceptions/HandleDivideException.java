package Exceptions;

public class HandleDivideException extends Exception {
  HandleDivideException(String error) {
    System.out.println("Error: " + error);
  }
}
