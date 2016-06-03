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
	     double median = getMedian(scores);
	    double total = 0;
	    for(int i = 0; i < scores.length; i++){
	        total += scores[i];
	    }
	    double mean = total/(double)scores.length;
	    double [] nums = new double [scores.length];
        for(int i = 0; i < scores.length; i++){
            nums[i] = Math.pow(scores[i]-mean, 2);
        }
	    double total1 = 0;
	    for(int i = 0; i < scores.length; i++){
	        total1 += nums[i];
	    }
	    double mean1 = total1/(scores.length-1);
	    double stddev = Math.sqrt(mean1);
	    double skewness = 3*(mean-median)/stddev;
	    return skewness;
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