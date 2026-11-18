import java.util.Scanner;

public class TaskTwo {
	public static void main(String[] args) {
		
		Scanner inputScore = new Scanner(System.in);

    int scoreSum = 0;
    double scoreAverage = 0;
    int scoreCounter = 1;

    for(scoreCounter = 1; scoreCounter <= 10; scoreCounter++) {
        System.out.print("Enter a score: ");
        int userScore = inputScore.nextInt();

        scoreSum += userScore;
        scoreAverage = (double)scoreSum / scoreCounter;
    }

    System.out.printf("%s%f%n","Average of scores: ", scoreAverage);
    
	}
}
