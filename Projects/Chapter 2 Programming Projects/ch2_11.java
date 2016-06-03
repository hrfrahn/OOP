/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 2.11
 * 1/12/16
 */
// This program calculates the approximate population of the US after x years.
import java.util.Scanner;
public class ch2_11{
	public static void main(String [] args){
		//get input
		Scanner input = new Scanner(System.in);
		System.out.print("How many years in the future to calculate the population for?: ");
		double x = input.nextDouble();
		// calculate how many births, deaths, and immigrants per year
		double BirthsPerYear = (60*60*24*365)/7.0;
		double DeathsPerYear = (60*60*24*365)/13.0;
		double ImmigrantsPerYear = (60*60*24*365)/45.0;
		//display the results for the next 5 years
		double CurrentPop = 312032486;
		for(double i = 1;i<=x;i++){
			CurrentPop = CurrentPop+BirthsPerYear+ImmigrantsPerYear-DeathsPerYear;
		}
		System.out.printf("Projected population in %.0f: %.0f\n",2016+x,CurrentPop);
		input.close();
	}
}