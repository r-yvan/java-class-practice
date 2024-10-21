package Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        int result = product.multiply(12, 34);
        System.out.println("The Product is: " + result);
    }
}
