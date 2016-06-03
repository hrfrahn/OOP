/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.43 
 * 2/17/16
 */
 // this program prints a number pyramid
import java.util.Scanner;
public class HelloWorld{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int lines = input.nextInt();
		final int MAX_WIDTH = (lines*2-1)+(lines*2-2);
		int move = MAX_WIDTH/2;
		String spaces = "";
		for(int i = 0; i < move; i++){
			spaces += " ";
		}
		if(lines>9){
		    spaces += " ";
		}
		for(int i = 1; i <= lines; i++){
			System.out.print(spaces);
			for(int j = i; j > 0; j--){
				System.out.print(j+" ");
			}
			for(int j = 2; j <= i; j++){
				System.out.print(j+" ");
			}
			System.out.println("");
			spaces = "";
			for(int x = 2*i; x < move; x++){
				spaces += " ";
			}
			if(lines>9&&i<9){
		        spaces += " ";  
		    }
		}
	}
}