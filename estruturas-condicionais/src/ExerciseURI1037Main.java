import java.util.Locale;
import java.util.Scanner;

//Intervalo

public class ExerciseURI1037Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		double anyValue;
		
		anyValue = sc.nextDouble();
		
		if (anyValue >= 0 && anyValue <= 25) {
			System.out.println("Intervalo [0,25]");
		} 
		else if (anyValue > 25.00 && anyValue <= 50.00) {
			System.out.println("Intervalo (25,50]");
		} 
		else if (anyValue > 50.00 && anyValue <= 75.00) {
			System.out.println("Intervalo (50,75]");
		}
		else if (anyValue > 75.00 && anyValue <= 100.00) {
			System.out.println("Intervalo (75,100]");
		} 
		else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();

	}

}
