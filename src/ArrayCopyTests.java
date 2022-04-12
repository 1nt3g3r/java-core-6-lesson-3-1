import java.util.Arrays;

public class ArrayCopyTests {
    public static void main(String[] args) {
        String[] names = {"John", "Bill"};

        String[] copyNames = Arrays.copyOf(names, names.length);

        names[0] = "Martin";

        System.out.println("copyNames = " + Arrays.toString(copyNames));

    }
}
