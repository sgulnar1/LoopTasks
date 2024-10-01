import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        //27
        //2,3,5,7,11,13,17,19,23
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        for (int i = 2; i <= numb; i++) {
            boolean isPrime= true;
            for (int j = 2; j < i/2; j++) {
                if (i % j == 0 && i != j) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(i + ", ");
        }
    }
}
