package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentExerciseProgramMain {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Student - Ler 3 notas do ano, gerar a media atual, avisar se passou
		 * ou reprovou, se reprovou, informar quantos pontos faltaram
		 * */
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.avg1 = sc.nextDouble();
		student.avg2 = sc.nextDouble();
		student.avg3 = sc.nextDouble();
				
		student.finalAvg();
		student.passOrFailed();
		
		sc.close();

	}
	

}
