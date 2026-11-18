import java.util.Scanner;

public class TaskFive {
	public static void main(String[] args) {
		
		Scanner inputScore = new Scanner(System.in);

    int evenScoreSum = 0;
    int scoreCounter = 1;

    for(scoreCounter = 1; scoreCounter <= 10; scoreCounter++) {
        System.out.print("Enter a score: ");
        int userScore = inputScore.nextInt();

        if(userScore % 2 == 0) {
              evenScoreSum += userScore;      
        }
    }
    System.out.printf("%s%d%n","Sum of even number: ", evenScoreSum);
    
	}
}
