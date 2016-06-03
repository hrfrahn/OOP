/* Harrison Frahn 
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 3.1
 * 1/23/16
 */
// this program solves a quadratic equation
import java.util.Scanner;
public class ch3_1{
	public static void main(String [] args){
		// create a scanner and get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = input.nextDouble();
		System.out.print("Enter b: ");
		double b = input.nextDouble();
		System.out.print("Enter c: ");
		double c = input.nextDouble();
		double disc = b*b-4*a*c;
		if(disc < 0){
			System.out.println("No real roots");
		}
		else if(disc ==0){
			double root = (b*-1)/(2*a);
			System.out.print("The root is "+root);
		}
		else{
			double root1 = ((b*-1)+Math.pow(disc,0.5))/(2*a);
			double root2 = ((b*-1)-Math.pow(disc,0.5))/(2*a);
			System.out.print("The roots are "+root1+" and "+root2);
		}
		input.close();
	}
}