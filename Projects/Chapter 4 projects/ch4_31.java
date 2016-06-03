/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.31
 * 2/17/16
 */
 // this program calculates future CD value
import java.util.Scanner;
public class ch4_31{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the initial deposit amount: ");
		double initial = input.nextDouble();
		System.out.print("Enter the annual percentage yield: ");
		double yield = input.nextDouble();
		System.out.print("Enter the maturity period (number of months): ");
		double months = input.nextDouble();
		System.out.println("Month  CD Value");
		double next = initial;
		for(int i = 1; i <= months; i++){
			next = initial;
			next *= yield;
			initial = initial + next/1200;
			System.out.printf("%d      $%.2f\n", i, initial);
		}
		input.close();
	}
}