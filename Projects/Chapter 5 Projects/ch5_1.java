/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 5.1
 * 3/2/16
 */
// this program finds the first 50 hexagonal numbers 
public class ch5_1{
	public static void main(String [] args){
		System.out.println("This program finds the first 50 hexagonal numbers.");
		for(int i = 1; i<=50; i++){
			System.out.print(getHexogonalNumber(i)+" ");
			if(i%10==0){
				System.out.println("");
			}
		}
	}
	public static int getHexogonalNumber(int n){
		int hex = n*(2*n-1);
		return hex;
	}
}