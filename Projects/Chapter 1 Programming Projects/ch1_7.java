/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 1.7
 * 1/7/16
 */
//This program calculates an approximation of pi using 2 infinite series
public class ch1_7{
	public static void main(String [] args){
		//calculate display pi using the first series
		double pi1 = 4.0 * (1.0-1.0/3.0+1.0/5.0-1.0/7.0+1.0/9.0-1.0/11.0);
		System.out.println("Pi approximated using  4 * (1-1/3+1/5-1/7+1/9-1/11) is "+pi1);
		//calculate display pi using the first series
		double pi2 = 4.0 * (1.0-1.0/3.0+1.0/5.0-1.0/7.0+1.0/9.0-1.0/11.0+1.0/13.0);
		System.out.println("Pi approximated using  4 * (1-1/3+1/5-1/7+1/9-1/11+1/13) is "+pi2);
	}
}