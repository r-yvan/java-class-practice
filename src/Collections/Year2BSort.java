package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Year2BSort {
  public static void main(String[] args) {
    List<Student2> list = new ArrayList<>();
    list.add(new Student2(4, "Ruth", "Sitamusahau"));
    list.add(new Student2(1, "Dianah", "Iranzi"));
    list.add(new Student2(2, "Joyeuse", "Iradukunda"));
    
    
    Collections.sort(list);
    
    System.out.println(list);
  }
}
