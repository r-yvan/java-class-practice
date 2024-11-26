package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByLastDigit {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(80);
    numbers.add(19);
    numbers.add(41);
    numbers.add(17);
    numbers.add(12);
    numbers.add(25);
    numbers.add(19);
    
    Collections.sort(numbers, new Comparator<Integer>() {
      @Override
      public int compare(Integer num1, Integer num2) {
        return (num1 % 10) - (num2 % 10);
      }
    });
    
    System.out.println("Sorted List based on the last digit:");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
  }
}
