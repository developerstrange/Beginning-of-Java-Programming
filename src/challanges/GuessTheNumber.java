package challanges;
import java.util.Random;
import java.util.Scanner;
class game{
	int number;
	int computerNumber;
	int userNumber;
	int noOfguess = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public game() {
		Random r = new Random();
		computerNumber = r.nextInt(100);
	}
	
	public void takeUserInput() {
		System.out.print("Enter your guessed number : ");
		userNumber = sc.nextInt();
	}
	
	public boolean isCorrectNumber() {
		
		noOfguess++;
		if(userNumber == computerNumber) {
			System.out.format("Your guess is right.\nYou completed it in %d guesses.",noOfguess);
			return true;
		}
		else if(userNumber > computerNumber) {
			System.out.println("Too big number u guessed. Try again....");
		}
		else if(userNumber < computerNumber) {
			System.out.println("Too small number u guessed. Try again...");
		}
			return false;
			
	}
	
	public void setGuess() {
		this.noOfguess = 0;
	}
	public int getGuess() {
		return noOfguess;
	}
	
	
}

public class GuessTheNumber {

	public static void main(String[] args) {
		System.out.println("\t\t\t\tWelcome to the Game!!\n");
		
		boolean b = false;
		game g = new game();
		while(!b) {
		g.takeUserInput();
		b = g.isCorrectNumber();
		}

		System.out.println("\nComputer number was: "+g.computerNumber);
	}

}
