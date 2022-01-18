import java.util.Locale;
import java.util.Scanner;

//Imposto de renda

public class ExerciseURI1051Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		double salary, imposto;
		
		salary = sc.nextDouble();
		
		if (salary <= 2000.00) {
			imposto = 0.0;
		} 
		else if (salary <= 3000.00) {
			imposto = (salary - 2000.00) * 0.08;
        } 
		else if (salary <= 4500.00) {
			imposto = (salary - 3000.00) * 0.18 + 1000.00 * 0.08;
        } 
		else {
			imposto = (salary - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
        } 
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();

	}

}
