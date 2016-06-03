/* Harrison Frahn
 * Object Oriented Programming
 * Period 2-Mr. Friedland
 * Chapter 3.21
 * 1/25/16
 */
// this program calculates the day of the week using zeller's congruence
import java.util.Scanner;
public class ch3_21{
	public static void main(String [] args){
		//create a scanner and get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year(eg 2014): ");
		int year = input.nextInt();
		System.out.print("Enter the month 1-12: ");
		int month = input.nextInt();
		// if it is jan. or feb. m = 13 or 14
		int m = month;
		switch(month){
		case 1: m = 13; year-=1; break;
		case 2: m = 14; year-=1; break;
		}
		int k = year % 100;
		System.out.print("Enter the day of the month 1-31: ");
		int q = input.nextInt();
		int j = year /100;
		// determine what day it is
		int h = (q+((26*(m+1))/10)+k+(k/4)+(j/4)+(5*j))%7;
        // display results
		switch(h-1){
		case 0: System.out.print("Day of the week is Sunday."); break;
		case 1: System.out.print("Day of the week is Monday."); break;
		case 2: System.out.print("Day of the week is Tuesday."); break;
		case 3: System.out.print("Day of the week is Wednesday."); break;
		case 4: System.out.print("Day of the week is Thursday."); break;
		case 5: System.out.print("Day of the week is Friday."); break;
		case -1: System.out.print("Day of the week is Saturday."); break;
        default: System.out.print("Something went wrong!"); break;
		}
		input.close();
	}
}