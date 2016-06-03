/* Harrison Frahn 
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 3.9
 * 1/26/16
 */
// this program calculates the last number in an ISBN sequence
import java.util.Scanner;
public class ch3_9{
	public static void main(String [] args){
		// create a scanner and get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of the ISBN number: ");
		String digits = input.next();
		int total = 0;
		for(int i = 1; i < 9; i++){
			total+=digits.charAt(i)*(i+1);
		}
		int last = total % 11;
		if(last==10){
			System.out.print("The ISBN-10 number is "+digits+"X.");
		}
		else{
			System.out.print("The ISBN-10 number is "+digits+last+".");
		}
		input.close();
	}
}