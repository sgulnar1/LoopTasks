import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int reverseNumber = 0;
        while (num != 0) {
            reverseNumber = 10 * reverseNumber + num % 10;
            num /= 10;
        }
        System.out.println(reverseNumber);
//14785
        //5 8 7 4 1 5*10000+8*1000 + 7*100 + 4*10+1
        //14785/1%10  5 //14785/10 5 1478
        //14785/10%10 8 //1478%10 8 147
        //14785/100%10 7 //147%10 7 14
        //14785/1000%10 4 //14%10 4 1
        //14785/10000%10 1 //1/10 1 0
    }
}
