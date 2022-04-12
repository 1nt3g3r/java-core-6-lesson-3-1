import java.util.Arrays;

public class ArrayTests {
    public static void main(String[] args) {
        //Init array - indices 0, 1, 2
        String[] names = new String[3];

        names[0] = "John";
        names[1] = "Bill";
        names[2] = "Bob";

        System.out.println("names[0] = " + names[0]);
        System.out.println("names[1] = " + names[1]);
        System.out.println("names[2] = " + names[2]);

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        names[0] = "Martin";
        System.out.println("names[0] = " + names[0]);

        //Init array using {}
        int[] temperature = {3, 5, 7};
        System.out.println("temperature[1] = " + temperature[1]);

        String formattedOutput = Arrays.toString(temperature);
        System.out.println("formattedOutput = " + formattedOutput);

        //Array length
        int[] values = new int[17];
        int lastValue = values[values.length - 1];
        System.out.println("lastValue = " + lastValue);
        int valueCount = values.length;
        System.out.println("valueCount = " + valueCount);
    }
}
