/* Harrison Frahn 
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 3.5
 * 1/24/16
 */
// this program plays a game of rock-paper-scissors
import java.util.Scanner;
public class ch3_17{
	public static void main(String [] args){
		// create a scanner and get input
		Scanner input = new Scanner(System.in);
		System.out.print("Scissors(0), rock (1), or paper(2): ");
		int choice = input.nextInt();
		// get computer throw 
		double comp_choice = Math.random();
		// display results
		if(comp_choice<=0.33){//paper
			if(choice==0){//scissors
				System.out.print("The computer is paper. You are scissors. You win!");
			}
			if(choice==1){//rock
				System.out.print("The computer is paper. You are rock. You lose!");
			}
			if(choice==2){//paper
				System.out.print("The computer is paper. You are paper too. It's a tie!");
			}
		}
		else if(comp_choice<=0.67){//rock
			if(choice==0){//scissors
				System.out.print("The computer is rock. You are scissors. You lose!");
			}
			if(choice==1){//rock
				System.out.print("The computer is rock. You are rock too. It's a tie!");
			}
			if(choice==2){//paper
				System.out.print("The computer is rock. You are paper. You win!");
			}
		}
		else if(comp_choice<=1){//scissors
			if(choice==0){//scissors
				System.out.print("The computer is scissors. You are scissors. It's a tie!");
			}
			if(choice==1){//rock
				System.out.print("The computer is scissors. You are rock. You win!");
			}
			if(choice==2){//paper
				System.out.print("The computer is scissors. You are paper. You lose!");
			}
		}
		input.close();
	}
}