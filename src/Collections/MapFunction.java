package Collections;
import java.util.*;

public class MapFunction {
  public static void main(String[] args) {
    Map<String, Integer> javaMarks = new HashMap<>();
    javaMarks.put("bonheur", 75);
    javaMarks.put("forgiveness", 80);
    javaMarks.put("ruth", 70);
    javaMarks.put("chael", 85);
    
    for (Map.Entry<String, Integer> entry : javaMarks.entrySet()) {
      String studentName = entry.getKey();
      Integer mark = entry.getValue();
      System.out.println(studentName + ": " + mark);
    }
  }
}
