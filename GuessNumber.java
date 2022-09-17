import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
public static void main(String Args[]) {
	Random r = new Random();
	Scanner scan = new Scanner(System.in);
	int num ;
	int guessed;
	System.out.println("Guess a number between 1 - 100 -->");
	guessed = scan.nextInt();
	num = r.nextInt(100)+1;
	while(!(num==guessed)) {
			while(num>guessed) {
				System.out.println("Your number is too low");
				guessed = scan.nextInt();
			}
			while(num<guessed) {
				System.out.println("Your number is too high");
				guessed = scan.nextInt();
			}
		}
	
		System.out.println("You guessed the right number!");

}
}
