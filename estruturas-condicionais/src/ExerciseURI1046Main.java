import java.util.Scanner;

//Duração do jogo

public class ExerciseURI1046Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int startTime, endTime, gameDuration = 0;
		
		startTime = sc.nextInt();
		endTime = sc.nextInt();
		
		if (startTime < endTime) {
			gameDuration = endTime - startTime;
		} else {
			gameDuration = 24 - startTime + endTime;
		}
		
		System.out.println("O JOGO DUROU " + gameDuration + " HORA(S)");
		
		sc.close();

	}

}
