import java.util.Scanner;

public class TaskFour {
	public static void main(String[] args) {
		
		Scanner inputScore = new Scanner(System.in);

    int eveIndexSum = 0;
    int scoreCounter = 1;

    for(scoreCounter = 1; scoreCounter <= 10; scoreCounter++) {
        System.out.print("Enter a score: ");
        int userScore = inputScore.nextInt();

        if(scoreCounter % 2 == 0) {
              eveIndexSum += userScore;      
        }
    }
    System.out.printf("%s%d%n","Sum of even indexes: ", eveIndexSum);
    
	}
}
