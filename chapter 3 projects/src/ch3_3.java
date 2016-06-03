/* Harrison Frahn 
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 3.3
 * 1/24/16
 */
// this program solves a linear equation using Cramer's rule
import java.util.Scanner;
public class ch3_3{
	public static void main(String [] args){
		// create a scanner and get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = input.nextDouble();
		System.out.print("Enter b: ");
		double b = input.nextDouble();
		System.out.print("Enter c: ");
		double c = input.nextDouble();
		System.out.print("Enter e: ");
		double d = input.nextDouble();
		System.out.print("Enter e: ");
		double e = input.nextDouble();
		System.out.print("Enter f: ");
		double f = input.nextDouble();
		// if there is no solution, say so
		if(a*d-b*c==0){
			System.out.println("The equation has no solution.");
		}
		// if there is a solution, determine it and print it
		else{
			double x = (e*d-b*f)/(a*d-b*c);
			double y = (a*f-e*c)/(a*d-b*c);
			System.out.println("X is "+x+" and y is "+y+".");
		}
		input.close();
	}
}