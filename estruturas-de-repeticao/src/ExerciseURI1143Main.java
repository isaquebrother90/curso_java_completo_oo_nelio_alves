import java.util.Locale;
import java.util.Scanner;

//Quadrado e ao cubo

public class ExerciseURI1143Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			int quadrado, cubo;
			quadrado = i * i;
			cubo = quadrado * i;
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		sc.close();

	}

}
