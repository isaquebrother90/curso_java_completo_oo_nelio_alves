package outros_topicos_basicos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Operadores bitwise
		
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2); //E
		System.out.println(n1 | n2); //OU
		System.out.println(n1 ^ n2); // OU-exclusivo
		
		//Testar se o 6� bit do numero que o usuario entrar vale 1 ou 0
		
		System.out.println();
		System.out.print("Digite um n�mero para verificar o sexto bit: ");
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100000;//N�mero que se sabe que tem o 6� bit como 1
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");

		}

	}

}
