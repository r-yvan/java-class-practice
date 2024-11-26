package Collections;
public class Student2 implements Comparable<Student2> {
  int studentId;
  String firstName;
  String lastName;
  public Student2(int studentId, String firstName, String lastName){
    super();
    this.studentId = studentId;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  @Override
  public String toString(){
    return "Student2 [studentId=" + studentId +  ", firstName=" + firstName + ", lastName=" + lastName + "]";
  }
  
  public int compareTo(Student2 other){
    return this.firstName.compareTo(other.firstName);
  }
}