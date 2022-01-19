import java.util.Locale;
import java.util.Scanner;

public class ExerciseURI1134Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int x = sc.nextInt();
		
		int acumulator = 0;
		while(x != 0) {
			acumulator = acumulator + x; 
			x = sc.nextInt();
		}
		
		System.out.println(acumulator);
		
		sc.close();

	}

}
