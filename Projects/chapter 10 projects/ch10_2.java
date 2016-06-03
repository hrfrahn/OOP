/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 10.2
 * 4/20/16
 */
// this is the driver class for Ellipse
import java.util.Scanner;
public class ch10_2{
	public static void main(String [] args){
		System.out.println("This program uses the Ellipse class to calculate the area and perimeter of an ellipse.");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the x coordiante of the center of the ellipse: ");
		double x = input.nextDouble();
		System.out.print("Enter the y coordiante of the center of the ellipse: ");
		double y = input.nextDouble();
		System.out.print("Enter the major axis length of the ellipse: ");
		double majAL = input.nextDouble();
		System.out.print("Enter the minor axis length of the ellipse: ");
		double minAL = input.nextDouble();
		Ellipse e = new Ellipse(x,y,majAL,minAL);
		String cont = "";
		while(!(cont.equals("q"))){
			System.out.println("Enter a to see the area, p to see the perimeter, and q to quit.");
			cont = input.next();
			if(cont.equals("a")){
				System.out.println("Area: "+e.getArea());
			}
			else if(cont.equals("p")){
				System.out.println("Perimeter: "+e.getPerimeter());
			}
		}
	}
}