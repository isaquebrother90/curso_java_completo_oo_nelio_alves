import java.util.Locale;
import java.util.Scanner;

public class ExerciseURI1008Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		int number;
		int workedHours;
		double hourlyPay, salary;
		
		number = sc.nextInt();
		workedHours = sc.nextInt();
		hourlyPay = sc.nextDouble();
		salary = workedHours * hourlyPay;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();

	}

}
