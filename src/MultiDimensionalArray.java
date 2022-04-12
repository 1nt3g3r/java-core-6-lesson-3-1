import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        char[][] ticTacToe =
        {
                {'x', 'o', 'x'},
                {'x', 'x', 'o'},
                {'o', 'x', 'o'}
        };

        printField(ticTacToe);

        ticTacToe[1][1] = 'o';

        printField(ticTacToe);
    }

    private static void printField(char[][] field) {
        System.out.println(Arrays.toString(field[0]));
        System.out.println(Arrays.toString(field[1]));
        System.out.println(Arrays.toString(field[2]));
    }

}
