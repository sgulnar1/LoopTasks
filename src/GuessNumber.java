import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rnd = new Random();
        int numb = rnd.nextInt(0, 100000);
        System.out.println(numb);
        while (true) {
            Scanner sc = new Scanner(System.in);
            int guessNumber = sc.nextInt();
            if (guessNumber / 1000 > numb)
                System.out.println("Sizin texmin chox boyukdur");
            else if (guessNumber / 100 > numb)
                System.out.println("Sizin texmin boyukdur");
            else if (guessNumber / 10 > numb)
                System.out.println("Sizin texmin bir az boyukdur");
            else if (guessNumber * 1000 < numb)
                System.out.println("Sizin texmin chox kicikdir");
            else if (guessNumber * 100 < numb)
                System.out.println("Sizin texmin kicikdir");
            else if (guessNumber * 10 < numb)
                System.out.println("Sizin texmin bir az kicikdir");
            else if(guessNumber==numb){
                System.out.println("Texmin doghrudur tebrikler");
                break;
            }
            else System.out.println("Yaxinlashirsiz...");
        }
    }
}
//147
//12 1000 Siin texmin chox boyukdur texmin/1000>eded
//        100 Sizin texmin boyukdur texmin/100>eded
//10 Sizin texmin bir az boyukdur texmin/10>eded

//        1000 Sizin texmin chox kicikdir texmin *1000 < eded
//100 Sizin texmin kicikdir texmin*100<eded
//10 Sizin bir az  kicikdir texmin*10<eded
//Yaxinlashirsiz