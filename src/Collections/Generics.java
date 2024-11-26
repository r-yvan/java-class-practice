package Collections;

public class Generics {
  public static <T> void printData(T data) {
    System.out.println("Data: " + data);
  }
  
  public static void main(String[] args) {
    printData(42);
    printData("Hello, Generics!");
    
    printData(3.14);
    printData(true);
  }
}
