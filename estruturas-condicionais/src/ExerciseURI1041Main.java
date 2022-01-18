import java.util.Locale;
import java.util.Scanner;

//Coordenadas de um ponto

public class ExerciseURI1041Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		double value1, value2;
		
		value1 = sc.nextDouble();
		value2 = sc.nextDouble();
		
		if (value1 > 0 && value2 > 0) {
			System.out.println("Q1");
		} 
		else if (value1 == 0 && value2 != 0) {
            System.out.println("Eixo Y");
        } 
		else if (value1 != 0 && value2 == 0) {
            System.out.println("Eixo X");
        }
		else if (value1 < 0 && value2 >= 0) {
			System.out.println("Q2");
		} 
		else if (value1 < 0 && value2 < 0) {
			System.out.println("Q3");
		}
		else if (value1 >= 0 && value2 < 0) {
			System.out.println("Q4");
		} 
		else {
			System.out.println("Origem");
		}
		
		sc.close();

	}

}
