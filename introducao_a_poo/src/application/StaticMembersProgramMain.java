package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class StaticMembersProgramMain {

	//public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Versão 1: Métodos na própria classe do programa

		/*System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);*/
		
		
		//Versão 2: Delegando responsabilidade de cálculo geométrico para a classe Calculator
		
		/*Calculator calc = new Calculator();
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);*/
		
		
		// Versão 3: Usando métodos estáticos da classe Calculator

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();

	}

	/*public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}*/

}
