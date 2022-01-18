import java.util.Locale;
import java.util.Scanner;

//Cálculo simples

public class ExerciseURI1010Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		int codPeca1, qtdePeca1, codPeca2, qtdePeca2;
		double valorPeca1, valorPeca2, valorTotalAPagar;
		
		codPeca1 = sc.nextInt();
		qtdePeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		codPeca2 = sc.nextInt();
		qtdePeca2 = sc.nextInt();
		valorPeca2= sc.nextDouble();
		
		valorTotalAPagar = (qtdePeca1 * valorPeca1) + (qtdePeca2 * valorPeca2); 
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotalAPagar);
		
		sc.close();

	}

}
