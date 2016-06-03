/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 10.4
 * 4/20/16
 */
 // this program computes an infinite series
import java.util.Scanner;
import java.math.BigDecimal;
public class HelloWorld{
    public static void main(String []args){
        System.out.println("This program computes an infinite series for i = 10, 50, 100, 500, and 1000.");
        System.out.print("i = 10: ");
       System.out.println(computeSeries(7));
        System.out.print("i = 50: ");
        System.out.println(computeSeries(50));
        System.out.print("i = 100: ");
        System.out.println(computeSeries(100));
        System.out.print("i = 500: ");
        System.out.println(computeSeries(500));
        System.out.print("i = 1000: ");
        System.out.println(computeSeries(1000));
     }
    public static BigDecimal factorial(BigDecimal num){
        BigDecimal total = new BigDecimal("1");
        int num1 = num.intValue();
        for(int i = 1; i<= num1; i++){
             total = total.multiply(new BigDecimal(i));
        }
        return total;
    }
    public static BigDecimal computeSeries(int num){
        BigDecimal total = BigDecimal.ZERO;
        for(int i = 0; i < num; i++){
            BigDecimal iter = new BigDecimal(i);
            BigDecimal top = factorial(iter).multiply(factorial(iter));
            BigDecimal b = new BigDecimal(2*iter.intValue()+1);
            BigDecimal bottom = factorial(b);
            BigDecimal t = top.divide(bottom, 25, BigDecimal.ROUND_UP);
            BigDecimal m = t.divide(new BigDecimal(2), 25, BigDecimal.ROUND_UP);
            total = total.add(m);
        }
        return total;
    }
}
