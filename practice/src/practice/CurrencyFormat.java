package practice;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
	public static void main(String[] args) {
		double amount = 25899.90;

		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(numberFormat.format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.GERMANY).format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.ITALY).format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.JAPAN).format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(amount));
	}
}
