package util;

public class CurrencyConverter {
	
	public static double value;
	public static double dollarExchange;
	
	public static double dollarToRealConverter(double value, double dollarExchange) {
		double result = value * dollarExchange;
		return result + calcIOF(result);
	}
	
	public static double calcIOF(double anyValue) {
		return anyValue * 0.06;
	}
	

}