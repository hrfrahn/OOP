/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 5.2
 * 3/2/16
 */
// this program multiplies the digits of a number
import java.util.Scanner;
public class ch5_2{
	public static void main(String [] args){
		System.out.print("Enter a number for its digits to be multiplied: ");
		Scanner input = new Scanner(System.in);
		long num = input.nextLong();
		System.out.println("The product of the digits of "+num+" is "+multiplyDigits(num));
		input.close();
	}
	public static int multiplyDigits(long n) {
		int product = 1; 
		while(n>1){
			product *= n%10;
			n /= 10;
		}
		return product;
	}
}