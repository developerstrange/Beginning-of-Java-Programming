package challanges;
import java.util.Scanner;
import java.util.Random; 

public class Rock_Paper_Scissor_game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.print("It's your turn. Enter your choice(0 for Rock, 1 for paper, 2 for Scissors): ");
		int user_choice = sc.nextInt();
		if(user_choice<0 || user_choice>2) {
			System.out.println("Invalid Input. Please enter a number between 0,1 or 2.");
			return;
		}
		switch(user_choice) {
		 case 0->System.out.println("Rock!");
		 case 1->System.out.println("Paper!");
		 case 2->System.out.println("Scissor!");
		}
		System.out.print("Now, it's computer turn. Computer choice is: ");
		int com_choice = random.nextInt(3);
		switch(com_choice) {
		 case 0->System.out.println("Rock!");
		 case 1->System.out.println("Paper!");
		 case 2->System.out.println("Scissor!");
		}
		
		if(user_choice == com_choice) {
			System.out.println("This match is a tie!");
		}
		else if(user_choice == 0 && com_choice == 2 || user_choice == 1 && com_choice == 0 || user_choice == 2 && com_choice == 1) {
		System.out.println("You win!");
		}
		else {
			System.out.println("Sorry, you loose. Computer Win!");
		}
		

	}
}
