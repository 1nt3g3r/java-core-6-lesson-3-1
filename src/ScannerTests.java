import java.util.Scanner;

public class ScannerTests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
//        String line = scanner.nextLine();

//        System.out.println("line = " + line);
        System.out.println("(a + b) = " + (a + b));

        scanner.close();
//
//        scanner = new Scanner(System.in);
//
//        scanner.nextLine();



    }
}
