import java.util.Scanner;
/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 4.9
 * 2/6/16
 */
// this program determines the highest 2 scores from a pool of students
public class ch4_9{
	public static void main(String [] args){
		//create a scanner and get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int student_num = input.nextInt();
		int highscore = 0, highscore2 = 0;
		String name1="", name2="";
		for(int i = 1; i <= student_num; i++){
			System.out.print("Enter the score of student "+i+": ");
			int score = input.nextInt();
			System.out.print("Enter the name of student "+i+": ");
			String name = input.next();
			if(score>highscore){
				highscore = score; highscore2 = highscore;
				name1 = name; name2 = name;
			}
			else if(score < highscore2){
				highscore2 = score;
				name2 = name;
			}
		}
		// display highscores
		System.out.println("Highest score: "+highscore+", "+name1);
		System.out.println("Second highest score: "+highscore2+", "+name2);
		input.close();
	}
}