/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 6.5
 * 3/16/16
 */
// this program factors a trinomial
import java.util.Scanner;
public class ch6_5{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = input.nextInt();
		System.out.print("Enter b:");
		int b = input.nextInt();
		System.out.print("Enter c:");
		int c = input.nextInt();
		if(a==1){
			int [] fact = factorBasic(b,c);
			if(fact[0]!=0){
				System.out.print("Factored Equation: ");
				printFactorization(fact);
			}
			else{
				System.out.print("The equation is unfactorable over the integers (cannot be factored).");
			}
		}
		else{
			int [] fact = factorAdvanced(a,b,c);
			if(fact[0]!=0){
				System.out.print("Factored Equation: ");
				printFactorization(fact);
			}
			else{
				System.out.print("The equation is unfactorable over the integers (cannot be factored).");
			}
		}
		input.close();
	}
	public static int [] factorBasic(int b, int c){
		int [] factors = getFactors(c);
		int [] factored = {1,1,1,1};
		for(int i = 0; i < factors.length; i++){
			for(int j = 0; j < factors.length; j++){
				if(factors[i]*factors[j]==c&&factors[i]+factors[j]==b){
					factored[1]=factors[i]; factored[3]=factors[j];
					return factored;
				}
			}
		}
		int [] err = {0,0,0,0}; return err;
	}
	public static int [] factorAdvanced(int a, int b, int c){
		int [] nums = factorBasic(b, a*c);
		int [] next = new int[4];
		next[0]=a; next[1]=nums[3]; next[2]=nums[1]; next[3]=c;
		int [] end = new int[4];
		end[0]=gcf(next[0],next[1]); 
		end[1]=gcf(next[2],next[3]);
		end[2] = next[0]/gcf(next[0], next[1]);
		end[3] = next[1]/gcf(next[0], next[1]);
		if(-1*end[1]*end[3]==c){
			end[1]=-1*end[1];
		}
		if(nums[0]==0){
			int [] err = {0,0,0,0};
			return err;
		}
		return end;
	}
	public static int gcf(int a, int b){
		int [] factA = getFactors(a);
		int [] factB = getFactors(b);
		int gcf = 1;
		for(int i = 0; i < factA.length; i++){
			for(int j = 0; j < factB.length; j++){
				if(factA[i]==factB[j]&&factA[i]>gcf){
					gcf = factA[i];
				}
			}
		}
		return gcf;
	}
	public static char sign(int x){
		if(x<0){
			return '-';
		}
		return '+';
	}
	public static void printFactorization(int [] factors){
		if(factors[0]==1){
			System.out.print("(x+"+factors[1]+")");
		}
		else{
			System.out.print("("+factors[0]+"x+"+factors[1]+")");
		}
		if(factors[2]==1){
			System.out.print("(x+"+factors[3]+")");
		}
		else{
			System.out.print("("+factors[2]+"x+"+factors[3]+")");
		}
	}
	public static int [] getFactors(int num){
		//get the number of factors
		if(num<0){
			num*=-1;
		}
		int num_facts = 0;
		for(int factor = 1; factor <= num; factor++){
			if(num%factor==0){
				num_facts++;
			}
		}
		// array has to be twice the size to hold negative factors
		int [] factors = new int[num_facts*2];
		// find the factors
		int x = 0;
		for(int factor = 1; factor <= num; factor++){
			if(num%factor==0){
				factors[x] = factor;
				factors[x+1] = factor*-1;
				x+=2;
			}
		}
		return factors;
	}
}