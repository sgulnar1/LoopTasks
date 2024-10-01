public class Multiplication {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a++) {
            for (int y = 1; y <= 10; y++) {
                System.out.print(y + "*" + a + "=" + (a * y) + "\t");
            }
            System.out.println();
        }
    }
}
