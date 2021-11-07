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

    @Test
    public void testCreateNumberFromMMXXI(){
        RomanNumeralBuilder romanNumeralBuilder = new RomanNumeralBuilder("MMXXI");
        RomanNumeral romanNumeral = romanNumeralBuilder.buildRomanNumeral();
        Assertions.assertEquals(2021,romanNumeral.calculateVale());
    }

    @Test
    public void testCreateNumberFromMMCDXXI(){
        RomanNumeralBuilder romanNumeralBuilder = new RomanNumeralBuilder("MMCDXXI");
        RomanNumeral romanNumeral = romanNumeralBuilder.buildRomanNumeral();
        Assertions.assertEquals(2421,romanNumeral.calculateVale());
    }
    @Test
    public void testCreateNumberFromMMC(){
        RomanNumeralBuilder romanNumeralBuilder = new RomanNumeralBuilder("MMCD");
        RomanNumeral romanNumeral = romanNumeralBuilder.buildRomanNumeral();
        Assertions.assertEquals(2400,romanNumeral.calculateVale());
    }
    @Test
    public void testCreateNumberFromMMCX(){
        RomanNumeralBuilder romanNumeralBuilder = new RomanNumeralBuilder("MMCDX");
        RomanNumeral romanNumeral = romanNumeralBuilder.buildRomanNumeral();
        Assertions.assertEquals(2410,romanNumeral.calculateVale());
    }
    @Test
    public void testCreateNumberFromDX(){
        RomanNumeralBuilder romanNumeralBuilder = new RomanNumeralBuilder("DX");
        RomanNumeral romanNumeral = romanNumeralBuilder.buildRomanNumeral();
        Assertions.assertEquals(510,romanNumeral.calculateVale());
    }
    @Test
    public void testCreateNumberFromCDX(){
        RomanNumeralBuilder romanNumeralBuilder = new RomanNumeralBuilder("CDX");
        RomanNumeral romanNumeral = romanNumeralBuilder.buildRomanNumeral();
        Assertions.assertEquals(410,romanNumeral.calculateVale());
    }

    @Test
    public void testCreateNumberFromMMXVIII(){
        RomanNumeralBuilder romanNumeralBuilder = new RomanNumeralBuilder("MMXVIII");
        RomanNumeral romanNumeral = romanNumeralBuilder.buildRomanNumeral();
        Assertions.assertEquals(2018,romanNumeral.calculateVale());
    }
    @Test
    public void testCreateNumberFromMMM(){
        RomanNumeralBuilder romanNumeralBuilder = new RomanNumeralBuilder("MMM");
        RomanNumeral romanNumeral = romanNumeralBuilder.buildRomanNumeral();
        Assertions.assertEquals(3000,romanNumeral.calculateVale());
    }
}
