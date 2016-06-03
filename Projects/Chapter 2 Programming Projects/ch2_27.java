/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 2.27
 * 1/14/16
 */
// This program prints a payroll statement using a GUI
import javax.swing.JOptionPane;
public class ch2_27{
	public static void main(String [] args){
		// get input
		String name = JOptionPane.showInputDialog(null,"Enter an Employee Name", "Employee Name", JOptionPane.QUESTION_MESSAGE);
		double hours = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the number of hours worked:", "Hours worked", JOptionPane.QUESTION_MESSAGE));
		double hourly = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the hourly pay:", "Hourly Pay", JOptionPane.QUESTION_MESSAGE));
		double fed_tax = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the federal withholding rate, ex 0.2:", "Federal Withholding", JOptionPane.QUESTION_MESSAGE));
		double state_tax = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the state tax, ex 0.08", "State Tax", JOptionPane.QUESTION_MESSAGE));
		// calculate deductions
		double gross_pay = hours*hourly;
		double fed_taxed = gross_pay*fed_tax;
		double state_taxed = gross_pay*state_tax;
		double end_pay = gross_pay-state_taxed-fed_taxed;
	}
}