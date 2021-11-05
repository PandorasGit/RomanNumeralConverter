import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void testCalculateValueFunctionBestCase(){

        RomanNumeral romanNumeral = new RomanNumeral("I");
        int calcValue = romanNumeral.calculateVale();
        Assertions.assertEquals(0,calcValue);
    }

    @Test
    public void testConvertNumeralStringIntoInt(){

        RomanNumeral romanNumeral = new RomanNumeral("I");
        int stringValue = romanNumeral.numeralInt;
        Assertions.assertEquals(1,stringValue);
    }

}
