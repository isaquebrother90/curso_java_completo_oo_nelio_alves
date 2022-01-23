package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountExerciseProgramMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		Locale.setDefault(Locale.US);

		System.out.print("Enter account number: ");
		String number = sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		sc.nextLine();
		
		Account account;
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valueInitial = sc.nextDouble();
			account = new Account(number, accountHolder, valueInitial);
		}
		else {
			account = new Account(number, accountHolder);
		}
		
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
		
	}

}
