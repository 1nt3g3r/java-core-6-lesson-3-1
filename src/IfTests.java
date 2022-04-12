import java.util.Scanner;

public class IfTests {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        if (number >= 10 && number <= 99) {
            System.out.println("Has 2 digits");
        } else {
            System.out.println("Has less or more than 2 digits");
        }
    }
}
