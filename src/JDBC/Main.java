package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/rca";
    String user = "postgres";
    String password = "Nry369&2008";
    
    String insertSQL = "INSERT INTO students (studentId, firstName, lastName) VALUES (?, ?, ?)";
    
    int studentId = 2;
    String firstName = "John";
    String lastName = " Hammond";
    
    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
      preparedStatement.setInt(1, studentId);
      preparedStatement.setString(2, firstName);
      preparedStatement.setString(3, lastName);
      
      int rowsInserted = preparedStatement.executeUpdate();
      if (rowsInserted > 0) {
        System.out.println("A new student was inserted successfully!");
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

