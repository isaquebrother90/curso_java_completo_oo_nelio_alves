package outros_topicos_basicos;

import java.util.Arrays;
import java.util.Scanner;

public class FunctionSintaxMain {

	public static void main(String[] args) {
		
		double  y = 25.0;
		double x = Math.sqrt(y);
		
		System.out.println(x);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		int higher = max(number1, number2, number3);
				
		showResult(higher);
		
		sc.close();

	}
	
	public static int max(int x, int y, int z) {
		
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
