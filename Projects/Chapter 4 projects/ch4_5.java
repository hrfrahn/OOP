/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland 
 * Chapter 4.5
 * 2/17/16
 */
 // this program prints an extended pounds and kilograms table
public class ch4_5{
	public static void main(String [] args){
		System.out.println("Kilograms     Pounds  |  Pounds     Kilograms");
		for(int i = 1,j=20; i < 200; i+=2,j+=5){
			System.out.printf("%-9d      %4.1f   |  %-6d       %4.2f\n",i,i*2.2,j,j/2.2);
		}
	}
}