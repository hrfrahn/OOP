/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 1.11
 * 1/9/16
 */
// This program calculates the approximate population of the US for the next 5 years.
public class ch1_11{
	public static void main(String [] args){
		// calculate how many births, deaths, and immigrants per year
		double BirthsPerYear = (60*60*24*365)/7.0;
		double DeathsPerYear = (60*60*24*365)/13.0;
		double ImmigrantsPerYear = (60*60*24*365)/45.0;
		//display the results for the next 5 years
		double CurrentPop = 312032486;
		for(int i = 1;i<=5;i++){
			//calculate the population for the year
			CurrentPop = CurrentPop+BirthsPerYear+ImmigrantsPerYear-DeathsPerYear;
			System.out.printf("Projected population in %d: %.0f\n",2015+i,CurrentPop);
		}
		
	}
}