/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 5.5
 * 3/2/16
 */
// this program computes the nth term in the sequence  1 + 1/3 + 1/6 + 1/10 + 1/15 + ... + 2/[n(n+1)]
import java.util.Scanner;
public class ch5_5{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Number of terms?");
		int terms = input.nextInt();
		System.out.println(computeSeries(terms));
	}
	public static double computeSeries(int terms){
		double sum = 0;
		for(int k = 1; k <= terms; k++){
			sum += 2/((double)k*(k+1));
		}
		return sum;
	}
}