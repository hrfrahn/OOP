/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.19
 * 2/17/16
 */
// this program prints a number pyramid
public class ch4_19{ 
    public static void main(String []args){ 
        String spaces = "";
		for(int i = 0; i < 15; i++){
			spaces += " ";
		}
        for(int i = 0; i < 8; i++){
            System.out.print(spaces);
            for(int j = 0; j < i; j++){
                System.out.printf((int)Math.pow(2,j)+" ");
            }
            for(int j = i; j >= 0; j--){
                System.out.print((int)Math.pow(2,j)+" ");
            }
            System.out.println("");
            spaces = "";
		    for(int x = 2*i; x < 13; x++){
			    spaces += " ";
		    }
        }
    }
}