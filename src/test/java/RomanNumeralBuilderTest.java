import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralBuilderTest {

    @Test
    public void testCreateNumberFromIII(){
        RomanNumeralBuilder romanNumeralBuilder = new RomanNumeralBuilder();
        RomanNumeral romanNumeral = romanNumeralBuilder.buildRomanNumeral("III");
        Assertions.assertEquals(3,romanNumeral.calculateVale());
    }
}
