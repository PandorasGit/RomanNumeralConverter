import model.RomanNumeral;
import model.RomanNumeralBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Basic roman numeral calculator, input a numeral");
        Scanner scanner = new Scanner(System.in);
        String numeralInputString = scanner.nextLine();

        RomanNumeralBuilder romanNumeralBuilder = new RomanNumeralBuilder(numeralInputString);
        RomanNumeral romanNumeral = romanNumeralBuilder.buildRomanNumeral();
        System.out.println("Result");
        System.out.println(romanNumeral.calculateVale());
    }
}
