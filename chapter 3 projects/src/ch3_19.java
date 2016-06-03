/* Harrison Frahn 
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 3.5
 * 1/24/16
 */
// this program calculates the perimeter of a triangle
import java.util.Scanner;
public class ch3_19{
	public static void main(String [] args){
		//create a scanner and get input
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the length of side 1: ");
		double side1 = input.nextDouble();
		System.out.print("Enter the length of side 2: ");
		double side2 = input.nextDouble();
		System.out.print("Enter the length of side 3: ");
		double side3 = input.nextDouble();
		// see if it's a valid triangle
		if(side1+side2<=side3||side1+side3<=side2||side2+side3<=side1){
			System.out.println("Invalid triangle.");
		}
		else{
			System.out.println("Perimeter is "+(side1+side2+side3));
		}
		input.close(); 
	}
}