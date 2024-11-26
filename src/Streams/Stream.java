package Streams;
import java.io.FileReader;
import java.io.FileWriter;

public class Stream {
  public static void main(String[] args) {
    try {
      FileWriter w = new FileWriter("./src/Streams/Lorem.txt");
      String msg = "Hello World!!";
      w.write(msg);
      w.close();
      
      FileReader fr = new FileReader("./src/Streams/Lorem.txt");
      int content;
      while ((content=fr.read()) != -1){
        w.write((char)content);
      }
    } catch (Exception e) {
      e.getMessage();
    }
  }
}