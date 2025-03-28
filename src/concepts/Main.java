package concepts;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author rajatsrivastava
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double amount = 11323.44432;

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(amount));

        nf = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(nf.format(amount));

        System.out.println(nf.getClass().getName());
    }
}