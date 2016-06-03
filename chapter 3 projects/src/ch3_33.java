/* Harrison Frahn 
 * Object Oriented Programming
 * Period 2-Mr. Friedland
 * Chapter 3.21
 * 1/25/16
 */
// this program calculates which package of rice is a better value
import java.util.Scanner;
public class ch3_33{
	public static void main(String [] args){
		// create a scanner and get input
		Scanner input = new Scanner(System.in);
		System.out.print("Weight of package 1: ");
		double weight1 = input.nextDouble();
		System.out.print("Price of package 1: ");
		double price1 = input.nextDouble();
		System.out.print("Weight of package 2: ");
		double weight2 = input.nextDouble();
		System.out.print("Price of package 2: ");
		double price2 = input.nextDouble();
		if(weight1/price1<weight2/price2){
			System.out.print("Package 1 has a better price.");
		}
		else if(weight1/price1>weight2/price2){
			System.out.print("Package 2 has a better price.");
		}
		else{
			System.out.print("Both packages have the same price.");
		}
		input.close();
	}
}