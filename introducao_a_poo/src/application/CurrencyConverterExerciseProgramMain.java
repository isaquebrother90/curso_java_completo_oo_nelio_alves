package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;
import util.CurrencyConverter;

public class CurrencyConverterExerciseProgramMain {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = CurrencyConverter.value = sc.nextDouble();
				
		System.out.print("How many dollars will be bought? ");
		double dollarToBought = CurrencyConverter.dollarExchange = sc.nextDouble();
		
		double amountToPaid = CurrencyConverter.dollarToRealConverter(dollarPrice, dollarToBought);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", amountToPaid);
		
		sc.close();

	}
	

}
