import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[]args) {
        int score = 0;
        int attempts = 10;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain=false;
        int choice;
        do {
            int x = rand.nextInt(100);
            int low = x - 5;
            int high = x + 5;

            System.out.println(x);

            for (int i = 1; i <= 10; i++) {
                System.out.println("Attempts left: " + attempts);
                System.out.println("Enter your guess");
                int user = sc.nextInt();
                if (user == x) {
                    System.out.println("Correct");
                    score = attempts * 10;
                    break;
                } else if (user >= high) {
                    System.out.println("Too high");
                } else if (user <= low) {
                    System.out.println("Too Low");
                } else if (user > x && user <= high) {
                    System.out.println("High");
                } else if (user < x && user >= low) {
                    System.out.println("Low");
                }
                System.out.println();
                attempts--;
            }
            System.out.println("Your score is: " + score);
            System.out.println("Press 1 to play again OR any number to Exit");
            choice = sc.nextInt();
            if(choice==1){
                playAgain =true;
                attempts=10;
            }
            else{
                playAgain=false;
            }
        } while (playAgain);

    }
}