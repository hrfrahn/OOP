/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 2.1
 * 1/9/16
 */
//This program reads a celsius temp from the console and converts it to fahrenheit
import java.util.Scanner;
public class ch2_1{
	public static void main(String[] args){
		//create a scanner
		Scanner input = new Scanner(System.in);
		//get the celsius temp
		System.out.println("Enter a degree in Celsius: ");
		//calculate and display the fahrenheit temp
		double C_Temp = input.nextDouble();
		double F_Temp = (9.0/5)*C_Temp+32;
		System.out.println(C_Temp+" Celsius is "+F_Temp+" Fahrenheit.");
		input.close();
	}
}