/* Harrison Frahn  
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 3.5
 * 1/24/16
 */
// this program determines the coordinates of the intersection of 2 lines
import java.util.Scanner;
public class ch3_25{
	public static void main(String [] args){
		// create a scanner and get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1: ");
		double x1 = input.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = input.nextDouble();
		System.out.print("Enter x2: ");
		double x2 = input.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = input.nextDouble();
		System.out.print("Enter x3: ");
		double x3 = input.nextDouble();
		System.out.print("Enter y3: ");
		double y3 = input.nextDouble();
		System.out.print("Enter x4: ");
		double x4 = input.nextDouble();
		System.out.print("Enter y4: ");
		double y4 = input.nextDouble();
		// determine point of intersection
		double px_top = ((x1*y2)-(y1*x2))*(x3-x4)-(x1-x2)*((x3*y4)-(y3*x4));
		double px_bottom = (x1-x2)*(y3-y4)-(y1-y2)*(x3-x4);
		double px = px_top/px_bottom;
		double py_top = ((x1*y2)-(y1*x2))*(y3-y4)-(y1*y2)*((x3*y4)-(y3*x4));
		double py_bottom = (x1-x2)*(y3-y4)-(y1-y2)*(x3-x4);;
		double py = py_top/py_bottom;
		// figure out if the lines are parallel or coinciding
		if((x1-x2)*(y3-y4)-(y1-y2)*(x3-x4)==0){
			System.out.print("The two lines are either parallel or coinciding.");
		}
		else{
			System.out.print("The coordinate of intersection is ("+(int)(px*100)/100.0+","+(int)(py*100)/100.0+").");
		}
		input.close();
	}
}