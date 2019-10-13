package programs.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		Locale locale=new Locale("in");
		System.out.println(locale.getLanguage());
		NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
		System.out.println(nf.format(431.12));
		

	}

}
