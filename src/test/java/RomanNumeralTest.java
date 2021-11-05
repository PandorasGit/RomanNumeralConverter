import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void testIfNextNumeralIsNull(){
        RomanNumeral romanNumeral = new RomanNumeral("i");
        RomanNumeral nextNumeral = romanNumeral.next();
        Assertions.assertNull(nextNumeral);

    }
}
