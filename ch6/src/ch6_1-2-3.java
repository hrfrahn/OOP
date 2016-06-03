import java.util.Scanner;
public class ch6_1{
	public static double getCurve(double [] scores, double median){
		return 80-median;
	}
	public static double getMedian(double [] scores){
		if(scores.length%2==0){
			double m1 = scores[(int) ((int)scores.length/2.0)-1];
			double m2 = scores[(int) ((int)scores.length/2.0)];
			return (m1+m2)/2;
		}
		return scores[(int) ((int)scores.length/2.0)];
	}
	public static void curveScores(double [] scores, double curve){
		for(int i = 0; i < scores.length; i++){
			scores[i]+=curve;
			if(scores[i]>100)
				scores[i]=100;
		}
	}
	public static String getGrade(double score){
		if(score>=87.5){ return "A";}
		if(score>=76.5){ return "B";}
		if(score>=65.5){ return "C";}
		if(score>=54.5){ return "D";}
		else return "F";
	}
	public static void printTable(double [] scores){
		System.out.println("Grade  |   Frequency");
		System.out.println("--------------------");
		int [] grades ={0,0,0,0,0};
		for(int i = 0 ; i < scores.length; i++){
			if((getGrade(scores[i])=="A")){ 
				grades[0]++;
			}
			if((getGrade(scores[i])=="B")){ 
				grades[1]++;
			}
			if((getGrade(scores[i])=="C")){ 
				grades[2]++;
			}
			if((getGrade(scores[i])=="D")){ 
				grades[3]++;
			}
			if((getGrade(scores[i])=="F")){ 
				grades[4]++;
			}
		}
		System.out.println("A      |   "+grades[0]);
		System.out.println("B      |   "+grades[1]);
		System.out.println("C      |   "+grades[2]);
		System.out.println("D      |   "+grades[3]);
		System.out.println("F      |   "+grades[4]);
	}
	public static double skewness(double [] scores){
		double l1 = 0.25*scores.length;
		double q1 = 0;
		if(l1%1==0){
			 q1 = (scores[(int)l1]+scores[(int)l1+1])/2;
		}
		else{
			l1 = Math.ceil(l1);
			 q1 = scores[(int)l1];
		}
		System.out.println(l1);
		System.out.println(q1);
		double l3 = 0.75*scores.length;
		double q3 = 0;
		if(l3%1==0){
			 q3 = (scores[(int)l3]+scores[(int)l3+1])/2;
		}
		else{
			l3 = Math.ceil(l3);
			 q3 = scores[(int)l3];
		}
		System.out.println(l3);
		System.out.println(q3);
		double q2 = getMedian(scores);
		System.out.println(q2);
		return (q3+q1-2*q2)/(q3-q1);
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of scores to be curved: ");
		int num_scores = input.nextInt();
		double [] scores = new double[num_scores];
		for(int i = 1; i <= num_scores; i++){
			System.out.print("Enter score "+i+": ");
			scores[i-1] = input.nextDouble();
		}
		java.util.Arrays.sort(scores);
		System.out.println("Pre-curve table:");
		printTable(scores);
		System.out.println("Skewness: "+skewness(scores));
		double median = getMedian(scores);
		double curve = getCurve(scores, median);
		curveScores(scores, curve);
		for(int i = 0; i < scores.length; i++){
			System.out.println("Curved score "+(i+1)+": "+scores[i]);
		}
		System.out.println("Post-curve table:");
		printTable(scores);
		input.close();
	}
}