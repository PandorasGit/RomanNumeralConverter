package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralBuilderTest {

    @Test
    public void testCreateNumberFromIII(){
        RomanNumeralBuilder romanNumeralBuilder = new RomanNumeralBuilder("III");
        RomanNumeral romanNumeral = romanNumeralBuilder.buildRomanNumeral();
        Assertions.assertEquals(3,romanNumeral.calculateVale());
    }

    @Test
    public void testCreateNumberFromMID(){
        RomanNumeralBuilder romanNumeralBuilder = new RomanNumeralBuilder("MID");
        RomanNumeral romanNumeral = romanNumeralBuilder.buildRomanNumeral();
        Assertions.assertEquals(1499,romanNumeral.calculateVale());
    }



}
