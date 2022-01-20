import java.util.Locale;
import java.util.Scanner;

public class ExerciseURI1134Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int number = sc.nextInt();
		
		int acumAlcool = 0;
		int acumGasolina = 0;
		int acumDiesel = 0;
		
		while(number != 4) {
			if (number == 1) {
				acumAlcool = acumAlcool + 1;
			}
			else if (number == 2) {
				acumGasolina = acumGasolina + 1;
			}
			else if (number == 3) {
				acumDiesel = acumDiesel + 1;
			}
			
			number = sc.nextInt();
						
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + acumAlcool);
		System.out.println("Gasolina: " + acumGasolina);
		System.out.println("Diesel: " + acumDiesel);
		
		sc.close();

	}

}
