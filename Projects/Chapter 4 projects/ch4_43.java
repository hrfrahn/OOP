/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.43 
 * 2/17/16
 */
 // this program ets a user input of seconds, then prints how long until time runs out every second
import java.util.Scanner;
public class ch4_43{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of seconds: ");
		int seconds = input.nextInt();
		for(int i = 0; i < seconds; i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				break;
			}
			System.out.print(seconds-i+" seconds ");
		}
	}
}