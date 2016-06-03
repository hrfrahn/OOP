import java.util.Scanner;
public class HelloWorld{
    public static int rando(int num1, int num2){
        return (int)(num1+Math.random()*(num2-num1+1));
    }
    public static double rando(double num1, double num2){
        return (num1+Math.random()*(num2-num1));
    }
    public static void main(String []args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter minimum value:");
       double n1 = input.nextDouble();
       System.out.print("Enter maximum value:");
       double n2 = input.nextDouble();
       int num1 = 0, num2 = 0;
       double d1 = 0, d2 = 0;
       if(n1%1==0){
           num1 = (int)n1;
       }
       else{
            d1 = n1;
       }
        if(n2%1==0){
           num2 = (int)n2;
        }
       else{
            d2 = n2;
       }
       if(num1!=0&&num2!=0){
            int [] nums = new int[10];
            for(int i = 0; i < 10; i++){
                nums[i] = rando(num1, num2);
            }
            System.out.println("Random numbers:");
            for(int i = 0; i < 10; i++){
                System.out.println(nums[i]);
            }
       }
       else{
           double [] nums = new double[10];
            for(int i = 0; i < 10; i++){
                nums[i] = rando(d1, d2);
            }
            System.out.println("Random numbers:");
            for(int i = 0; i < 10; i++){
                System.out.println(nums[i]);
             }
       }
    }
}
