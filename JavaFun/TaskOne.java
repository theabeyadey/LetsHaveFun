import java.util.Scanner;

public class TaskOne {
	public static void main(String[] args) {
		
		Scanner inputScore = new Scanner(System.in);

    int scoreSum = 0;
    int scoreCounter = 1;

    for(scoreCounter = 1; scoreCounter <= 10; scoreCounter++) {
        System.out.print("Enter a score: ");
        int userScore = inputScore.nextInt();

        scoreSum += userScore;
    }
    
    System.out.printf("%s%d%n","Sum of scores: ", scoreSum);
    
	}
}
