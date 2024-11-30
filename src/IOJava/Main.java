package IOJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      FileInputStream src = new FileInputStream("/media/rubuto-yvan/Personal Disk/Personal Skills Development/Coding & Development/Java/Projects/java-class-practice/src/IOJava/LoremInput.txt");
      FileOutputStream dest = new FileOutputStream("/media/rubuto-yvan/Personal Disk/Personal Skills Development/Coding & Development/Java/Projects/java-class-practice/src/IOJava/LoremOutput.txt");
      
      int singleByte;
      while ((singleByte = src.read()) != -1) {
        dest.write(singleByte);
      }
      
      src.close();
      dest.close();
    } catch (IOException error) {
      error.getMessage();
    }
  }
}
