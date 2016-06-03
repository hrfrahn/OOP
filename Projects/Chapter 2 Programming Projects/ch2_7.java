/* Harrison Frahn
 * Period 2 Object Oriented Programming
 * 1/11/16
 * This program calculates how many years and days equal a given number of minutes
 */
import java.util.Scanner;
public class ch2_7{
	public static void main(String [] args){
		//create a scanner and get input
		Scanner input = new Scanner(System.in);
		System.out.println("This program converts minutes to years and days.");
		System.out.print("Enter a number of minutes(not a decimal): ");
		long minutes = input.nextInt();
		// calculate years and days for the minutes
		long years = minutes/525600;
		long days = (minutes-years*525600)/1440;
		//display results
		System.out.print(minutes+" minutes is approximately "+years+" years and "+days+" days.");
		input.close();
	}
}