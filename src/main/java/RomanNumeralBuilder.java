import java.util.Locale;

public class RomanNumeralBuilder {
    public RomanNumeral buildRomanNumeral(String numeralString) {



        RomanNumeral rootNumeral = new RomanNumeral(numeralString.substring(0,1));

        for(int index=1;index>=numeralString.length();index++){

        }
        return rootNumeral;
    }
}
