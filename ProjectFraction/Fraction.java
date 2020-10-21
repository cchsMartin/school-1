/**
 *Author: Ayden Bales
 *Date: Sep 23, 2020
 *Description: Fraction Project
 */
public class Fraction {
	private int num = 1;
	private int den = 2;
	
	public Fraction() {
		num = 1;
		den = 2;
	}
	public Fraction(int numerator, int denominator) {
		num = numerator;
		den = denominator;
	}
	
	
	public void sum(int num2, int den2) {
		int numresult = num * den2 + num2 * den;
		int denresult = den * den2;
		System.out.println(num + "/" + den + " + " + num2 + "/" + den2 + " = " + numresult + "/" + denresult);
	}
	
	public void diff(int num2, int den2) {
		int numresult = num * den2 - num2 * den;
		int denresult = den * den2;
		System.out.println(num + "/" + den + " - " + num2 + "/" + den2 + " = " + numresult + "/" + denresult);
	}
	
	public void product(int num2, int den2) {
		int numresult = num * num2;
		int denresult = den * den2;
		System.out.println(num + "/" + den + " * " + num2 + "/" + den2 + " = " + numresult + "/" + denresult);
	}
	
	public void quotient(int num2, int den2) {
		int numresult = num * den2;
		int denresult = den * num2;
		System.out.println(num + "/" + den + " ÷ " + num2 + "/" + den2 + " = " + numresult + "/" + denresult);
	}
}
