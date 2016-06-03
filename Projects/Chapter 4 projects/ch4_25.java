/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.25 
 * 2/17/16
 */ 
// this program calculates pi
public class ch4_25{ 
	public static void main(String [] args){ 
		for(int i = 10000; i <= 100000; i+=10000){
			double pi = 0;
			for(int j = 1,x=0; j < i; j+=2,x+=1){
				if(x%2==0){
					pi += 1/(double)j;
				}
				else if(x%2!=0){
					pi-= 1/(double)j;
				}
			}
			pi *= 4;
			System.out.println("i = "+i);
			System.out.println("Pi = "+pi+"\n");
		}
	}
}