/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 2.25
 * 1/14/16
 */
//This program prints a payroll statement
import java.util.Scanner;
public class ch2_25{
	public static void main(String [] args){
		//create a scanner and get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name, e.g. Smith: ");
		String name = input.next();
		System.out.print("Enter the number of weekly hours: ");
		double hours = input.nextDouble();
		System.out.print("Enter the hourly pay: ");
		double hourly_pay = input.nextDouble();
		System.out.print("Enter federal tax withholding rate, for example 0.20: ");
		double fed_tax = input.nextDouble();
		System.out.print("Enter state tax withholding rate, for example 0.09: ");
		double state_tax = input.nextDouble();
		// calculate pay and deductions
		double gross_pay = hours*hourly_pay;
		double fed_taxed = gross_pay*fed_tax;
		double state_taxed = gross_pay*state_tax;
		double end_pay = gross_pay-state_taxed-fed_taxed;
		//display results
		System.out.println("Employee Name: "+name);
		System.out.println("Hours Worked: "+hours);
		System.out.printf("Hourly Pay: $%.2f\n", hourly_pay);
		System.out.printf("Gross Pay: $%.2f\n", gross_pay);
		System.out.println("Deductions:");
		System.out.printf("\tFederal Withholding(%.2f%%): $%.2f\n", fed_tax*100, fed_taxed);
		System.out.printf("\tState Withholding(%.2f%%): $%.2f\n", state_tax*100, state_taxed);
		System.out.printf("Net Pay: $%.2f", end_pay);
		input.close();
	}
}