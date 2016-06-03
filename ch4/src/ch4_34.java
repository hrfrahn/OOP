public class ch4_34{
	public static void main(String [] args){
		for(int i = 1; i < 1000000; i++){
			int sum = 0; 
			for(int div = 1; div < i; div++){
				if(i%div==0){
					sum += div;
				}
			}
			if(sum==i){
				System.out.println(i+" is a perfect number.");
			}
		}
	}
}