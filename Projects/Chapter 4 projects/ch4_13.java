/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.13
 * 2/6/16
 */
// this program finds the largest integer n such that n^3 < 12000
public class ch4_13{
	public static void main(String [] args){
		int i;
		for(i= 0; i*i*i<12000; i++){}
		System.out.print(i-1);
	}
}