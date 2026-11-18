import java.util.Scanner;

public class TaskEight {
	public static void main(String[] args) {
		
		Scanner inputScore = new Scanner(System.in);

    int scoreSum = 0;
    int scoreCounter = 1;

    for(scoreCounter = 1; scoreCounter <= 10; scoreCounter++) {
        System.out.print("Enter your score(0-100): ");
        int userScore = inputScore.nextInt();

        if(userScore >= 0 || userScore <= 100) {
          scoreSum += userScore;
        }   
    }
    System.out.printf("%s%d%n","Sum of scores: ", scoreSum);

	}
}
