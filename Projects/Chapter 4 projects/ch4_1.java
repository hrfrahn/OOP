/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.1
 * 2/17/16
 */
 // this program gest user input of numbers, then prints the average, number of positives and negatives, and total
import java.util.Scanner;
public class ch4_1{
	public static void main(String [] args){
		//create a scanner and get input
		Scanner input = new Scanner(System.in);
		int pos = 0, neg = 0, total = 0;
		double average = 0, num=-1;
		while(num!=0){
			System.out.print("Enter a number, the input ends if it is 0:");
			num = input.nextDouble();
			total++; 
			average += num;
			if(num<0){
				neg++;
			}
			else if(num>0){
				pos++;
			}
		}
		average /= total-1;
		System.out.println("The number of positives is "+pos);
		System.out.println("The number of positives is "+neg);
		System.out.println("The total is "+total);
		System.out.println("The average is "+average);
		input.close();
	}
}