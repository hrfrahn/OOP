/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.11
 * 2/6/16
 */
// this program prints all the number from 100-200 divisible by 5 or 6, not both
public class ch4_11{
	public static void main(String [] args){
		//display results
		int printed = 0;
		for(int i = 100; i <= 200; i++){
			if(i%5==0^i%6==0){
				System.out.print(i+" ");
				printed++;
			}
			if(printed>9){
				System.out.println("");
				printed = 0;
			}
		}
	}
}