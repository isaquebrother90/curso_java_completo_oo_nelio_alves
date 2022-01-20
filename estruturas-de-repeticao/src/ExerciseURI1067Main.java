import java.util.Locale;
import java.util.Scanner;

//Números ímpares

public class ExerciseURI1067Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int X = sc.nextInt();
		
		for (int i = 1; i <= X; i++) {
			if (i % 2 != 0) {
				int impares = i;
				System.out.println(impares);
			}
		}
		
		sc.close();

	}

}
