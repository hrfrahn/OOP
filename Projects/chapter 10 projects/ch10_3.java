/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 10.3
 * 4/20/16
 */
 // this program calculates the first 10 cubic numbers greater than Long.MAX_VALUE
import java.math.BigInteger;
public class ch10_3{
	public static void main(String [] args){
		System.out.println("The first 10 cubic numbers greater than Long.MAX_VALUE ("+Long.MAX_VALUE+")");
		double max = Math.ceil(Math.pow((double)Long.MAX_VALUE, 1.0/3));
		for(int i = 0; i < 10; i++){
			System.out.printf("%.0f\n",Math.pow(max+i, 3));
		}
	}
}