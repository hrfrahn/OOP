/* Harrison Frahn
 * Period 2 Object Oriented Programming
 * 1/11/16
 * This program calculates a tip after getting the subtotal and gratuity % from the user
 */
import java.util.Scanner;
public class ch2_5{
	public static void main(String [] args){
		//create a scanner and get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Subtotal: ");
		double subtotal = input.nextDouble();
		System.out.print("Enter the Gratuity percentage(as a decimal): ");
		double gratuity = input.nextDouble();
		double tip = subtotal + subtotal*gratuity;
		System.out.println("Subtotal: $"+subtotal);
		System.out.println("Gratuity %: "+gratuity);
		System.out.println("Tip: $"+subtotal*gratuity);
		System.out.println("Total: $"+tip);
		input.close();
	}
}