/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.7 
 * 2/17/16
 */
 // this program calculates the cost of tuition in 10 years. 
public class ch4_7{
    public static void main(String []args){
        int tuition = 10000; 
        for(int i = 0; i < 10; i++){
            tuition *= 1.05;
        }
        System.out.println("Tuition in 10 years: "+tuition);
        System.out.println("4 years of tuition: "+tuition*4);
    }
}
