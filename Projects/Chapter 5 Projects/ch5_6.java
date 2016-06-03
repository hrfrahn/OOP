/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 5.6
 * 3/2/16
 */
// this program adds zeroes to a number
import java.util.Scanner;
public class ch5_6{ 
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to add zeroes to: ");
		int num = input.nextInt();
		System.out.print("Enter the number of zeroes: ");
		int zeroes = input.nextInt();
		System.out.println(num+" + "+zeroes+" zeroes is "+addZeroes(num, zeroes)+".");
	}
	public static String addZeroes(int num, int zeroes){
		String num_str = (num+".");
		for(int i = 0; i < zeroes; i++){
			num_str+="0";
		}
		return num_str;
	}
}