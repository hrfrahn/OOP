/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 5.3
 * 3/2/16
 */
// this program prints a random pattern a given number of times
import java.util.Scanner;
public class ch5_3{
	public static void main(String [] args){
		System.out.print("Number of rows: ");
		Scanner input = new Scanner(System.in);
		long rows = input.nextInt();
		displayPattern(rows);
		input.close();
	}
	public static void displayPattern(long n){
		for(int i = 0; i < n; i++){
			for(int j = 0; j < (int)(Math.random()*10+1); j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}