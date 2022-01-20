import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N ; i++) {
			int Ns = sc.nextInt(); 
			soma += Ns;
		}
		
		System.out.println(soma);
		System.out.println();
		
		//Repetição baseada em contagem
		for (int i=0; i<5; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		System.out.println();
		
		//Repetição baseado em contagem regressiva
		for (int i=4; i>=0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		sc.close();

	}

}
