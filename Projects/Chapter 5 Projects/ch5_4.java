/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 5.4
 * 3/2/16
 */
// this program converts bytes to kilobits
import java.util.Scanner;
public class ch5_4{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int num = -1;
		while(num!=0){
			System.out.print("Enter 1 to convert bytes to kilobits, or 0 to convert kilobits to bytes: ");
			int which = input.nextInt();
			if(which==0){
				System.out.print("Enter the number of kilobits to convert to bytes, or enter 0 to stop: ");
				num = input.nextInt();
				if(num!=0)
					System.out.println(num+" kilobits is "+kilobitToByte(num)+" bytes.");
			}
			else if(which==1){
				System.out.print("Enter the number of bytes to convert to kilobits, or enter 0 to stop: ");
				num = input.nextInt();
				if(num!=0)
					System.out.println(num+" bytes is "+byteToKilobit(num)+" kilobits.");
			}
			else{
				System.out.println("You didn't enter 1 or 0!");
			}
		}
	}
	public static double kilobitToByte(double kb){
		return kb*125.0;
	}
	public static double byteToKilobit(double b){
		return b/125.0;
	}
}