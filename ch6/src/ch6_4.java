/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 6.4
 * 3/16/16
 */
// this program finds a random number between two given numbers.
import java.util.Scanner;
public class ch6_4{
    public static int rando(int num1, int num2){
        return (int)(num1+Math.random()*(num2-num1+1));
    }
    public static double rando(double num1, double num2){
        return (num1+Math.random()*(num2-num1));
    }
    public static String intOrDouble(String num){
    	if(num.indexOf('.')==-1){
    		return "int";
    	}
    	return "double";
    }
    public static void main(String []args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter minimum value:");
       String n1 = input.next();
       System.out.print("Enter maximum value:");
       String n2 = input.next();
       if(intOrDouble(n1).equals("int")&&intOrDouble(n1).equals("int")){
    	   int num1 = Integer.parseInt(n1);
    	   int num2 = Integer.parseInt(n2);
    	   int [] nums = new int[10];
    	   System.out.println("Random numbers between "+num1+" and "+num2+":");
    	   for(int i = 0; i < 10; i++){
    		   nums[i]=rando(num1, num2);
    		   System.out.println(nums[i]);
    	   }
       }
       else{
    	   double num1 = Double.parseDouble(n1);
    	   double num2 = Double.parseDouble(n2);
    	   double [] nums = new double[10];
    	   System.out.println("Random numbers between "+num1+" and "+num2+":");
    	   for(int i = 0; i < 10; i++){
    		   nums[i]=rando(num1, num2);
    		   System.out.println(nums[i]);
    	   }
       }
       input.close();
    }
}
