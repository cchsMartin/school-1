/**
 *Author: Ayden Bales
 *Date: Oct 23, 2020
 *Description: Fraction Project
 */
public class FractionTest {

	public static void main(String[] args) {
		// Default constructor test (fraction is 1/2):
		Fraction fr1 = new Fraction();
		fr1.sum(1, 3);
		fr1.diff(1, 3);
		fr1.product(1, 3);
		fr1.quotient(1, 3);
		System.out.println();
		
		// Custom fraction test (fraction is 2/3):
		Fraction fr2 = new Fraction(2, 3);
		fr2.sum(1, 4);
		fr2.diff(1, 4);
		fr2.product(1, 4);
		fr2.quotient(1, 4);
	}

}
