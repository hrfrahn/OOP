/* Harrison Frahn 
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 3.5
 * 1/24/16
 */
// this program determines what day it is
import java.util.Scanner;
public class ch3_5{
	 public static void main(String [] args){
		 // create a scanner and get input
		 Scanner input = new Scanner (System.in);
		 System.out.print("Enter today's day: ");
		 int today = input.nextInt();
		 System.out.print("Enter the number of days elapsed since today: ");
		 int elapsed = input.nextInt();
		 // calculate what day today is
		 int date = (elapsed%7)+today;
		 // display results
		 switch(today){
		 	case 0: System.out.print("Today is Sunday "); break;
		 	case 1: System.out.print("Today is Monday "); break;
		 	case 2: System.out.print("Today is Tuesday "); break;
		 	case 3: System.out.print("Today is Wednesday "); break;
		 	case 4: System.out.print("Today is Thursday "); break;
		 	case 5: System.out.print("Today is Friday "); break;
		 	case 6: System.out.print("Today is Saturday "); break;
		 }
		 switch(date){
		 	case 0: System.out.print("and the future day is Sunday."); break;
		 	case 1: System.out.print("and the future day is Monday."); break;
		 	case 2: System.out.print("and the future day is Tuesday."); break;
		 	case 3: System.out.print("and the future day is Wednesday."); break;
		 	case 4: System.out.print("and the future day is Thursday."); break;
		 	case 5: System.out.print("and the future day is Friday."); break;
		 	case 6: System.out.print("and the future day is Saturday."); break;
		 }
		 input.close();
	 }
}