/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.3
 * 2/17/16
 */
 // this program prints a pounds and kilograms table
public class ch4_3{
	public static void main(String [] args){
		System.out.println("Kilograms     Pounds");
		for(int i = 1; i < 200; i+=2){
			System.out.printf("%-9d      %4.1f\n",i,i*2.2);
		}
	}
}