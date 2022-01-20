package entities;

public class Student {

	public String name;
	public double avg1;
	public double avg2;
	public double avg3;
	
	public double finalAvg() {
		return avg1 + avg2 + avg3;
	}
	
	public void passOrFailed() {
		if (finalAvg() >= 60) {
			System.out.println("FINAL GRADE = " + String.format("%.2f", finalAvg()));
			System.out.println("PASS");
		}
		else {
			System.out.println("FINAL GRADE = " + String.format("%.2f", finalAvg()));
			System.out.println("FAILED");
			double minAvg = 60.0;
			System.out.printf("MISSING %.2f POINTS", minAvg - finalAvg());
		}
	}
	
}
