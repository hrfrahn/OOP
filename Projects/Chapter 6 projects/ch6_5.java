import java.util.Arrays;
import java.util.Scanner;
public class ch6_5{
	//TODO: make it work for the "tricky scenario" (check pdf), and add validateFactorization()
	public static void main(String [] args){
		int [] fact = factorBasic(7,12);
		int [] facts = factorAdvanced(4,-3,-10);
		System.out.println(Arrays.toString(facts));
		System.out.println(gcf(3,-6));
		printFactorization(facts);
	}
	public static int [] factorBasic(int b, int c){
		//TODO: add error handling
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
		return factored;
	}
	public static int [] factorAdvanced(int a, int b, int c){
		int [] nums = factorBasic(b, a*c);
		int [] next = new int[4];
		next[0]=a; next[1]=nums[3]; next[2]=nums[1]; next[3]=c;
		System.out.println(Arrays.toString(getFactors(a*c)));
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(next));
		int [] end = new int[4];
		end[0]=gcf(next[0],next[1]); end[1]=gcf(next[2],next[3]);
		end[2] = next[0]/gcf(next[0], next[1]);
		end[3] = next[1]/gcf(next[0], next[1]);
		System.out.println(Arrays.toString(end));
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