/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.43 
 * 2/17/16
 */
 // this program compares right to left and left to right calculations
public class ch4_23{
	public static void main(String [] args){
		double total1 = 0, total2 = 0;
		for(int i = 1; i <= 50000; i++){
			total1 += 1/(double)i;
		}
		for(int i = 50000; i >= 1; i--){
			total2 += 1/(double)i;
		}
		System.out.println("Left to right total: "+total1);
		System.out.println("Right to left total: "+total2);
	}
}