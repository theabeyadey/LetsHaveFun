import java.util.Scanner;

public class TaskSix {
	public static void main(String[] args) {
		
		Scanner inputScore = new Scanner(System.in);

    int evenScoreSum = 0;
    int scoreCounter = 1;
    double evenScoreAverage = 0;

    for(scoreCounter = 1; scoreCounter <= 10; scoreCounter++) {
        System.out.print("Enter a score: ");
        int userScore = inputScore.nextInt();

        if(userScore % 2 == 0) {
              evenScoreSum += userScore;  
              evenScoreAverage = (double)evenScoreSum / 5;    
        }
    }
    System.out.printf("%s%f%n","Average of even scores: ", evenScoreAverage);
    
	}
}
