/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 2.23
 * 1/12/16
 */
// this program converts an integer from 0-127 to its ascii value
import java.util.Scanner;
public class ch2_23{
	public static void main(String [] args){
		//get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number from 0-127 to convert to ASCII: ");
		int num = input.nextInt();
		char num_char = (char)num;
		System.out.print(num+" in ASCII is "+num_char+".");
		input.close();
	}
}