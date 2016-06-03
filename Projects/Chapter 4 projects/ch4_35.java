/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.35
 * 2/17/16
 */
// this program calculates a summation
public class ch4_35{
	public static void main(String [] args){
		double total = 0;
		for (int i = 1; i < 625; i++){
			total += 1/(Math.sqrt(i)+Math.sqrt(i+1));
		}
		System.out.printf("Total = %.2f",total);
	}
}