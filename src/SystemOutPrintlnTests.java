public class SystemOutPrintlnTests {
    public static void main(String[] args) {
//        Point point = new Point();
//        System.out.println(point + " (point)" + 7);

        System.out.print("1");
        System.out.print("2");

    }

    private static class TestClass {
        @Override
        public String toString() {
            return "This is some test class";
        }
    }

    private static class Point {
        private int x = 5;
        private int y = 7;

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}
