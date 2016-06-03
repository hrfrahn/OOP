/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 2.21
 * 1/12/16
 */
// This program calculates the future investment when given the original investment, number of years, and annual interest rate.
import java.util.Scanner;
public class ch2_21{
	public static void main(String [] args){
		//get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the investment amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter the annual interest rate as a %: ");
		double interest = input.nextDouble();
		interest /= 1200;
		System.out.print("Enter the number of years: ");
		double years = input.nextDouble();
		double futval = Math.pow(1+interest,12*years);
		System.out.printf("Accumulated value is $%.2f",futval*amount);
		input.close();
	}
}