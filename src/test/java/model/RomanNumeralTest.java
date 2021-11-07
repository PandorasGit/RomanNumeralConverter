package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void testCalculateValueFunctionBestCase(){

        RomanNumeral romanNumeral = new RomanNumeral("I");
        int calcValue = romanNumeral.calculateVale();
        Assertions.assertEquals(1,calcValue);
    }

    @Test
    public void testConvertNumeralStringIntoInt(){

        RomanNumeral romanNumeral = new RomanNumeral("I");
        int stringValue = romanNumeral.numeralInt;
        Assertions.assertEquals(1,stringValue);
    }

    @Test
    public void testOnePlusOne(){

        RomanNumeral romanNumeral = new RomanNumeral("I");
        romanNumeral.nextNumeral = new RomanNumeral("I");
        int addedValues = romanNumeral.calculateVale();
        Assertions.assertEquals(2,addedValues);
    }

    @Test
    public void testOnePlusOneThousand(){

        RomanNumeral romanNumeral = new RomanNumeral("M");
        romanNumeral.nextNumeral = new RomanNumeral("I");
        int addedValues = romanNumeral.calculateVale();
        Assertions.assertEquals(1001,addedValues);
    }

    @Test
    public void testThousandMinusOne(){

        RomanNumeral romanNumeral = new RomanNumeral("I");
        romanNumeral.nextNumeral = new RomanNumeral("M");
        int addedValues = romanNumeral.calculateVale();
        Assertions.assertEquals(999,addedValues);
    }

    @Test
    public void testOnePlusOnePlusOne(){
        RomanNumeral romanNumeral = new RomanNumeral("I");
        RomanNumeral nextNumeral = new RomanNumeral("I");
        romanNumeral.nextNumeral = nextNumeral;
        nextNumeral.nextNumeral = new RomanNumeral("I");
        int addedValues = romanNumeral.calculateVale();
        Assertions.assertEquals(3,addedValues);
    }

    @Test
    public void testCaluclateValueOfMID(){

        RomanNumeral romanNumeral = new RomanNumeral("M");
        RomanNumeral nextNumeral = new RomanNumeral("I");
        romanNumeral.nextNumeral = nextNumeral;
        nextNumeral.nextNumeral = new RomanNumeral("D");
        int addedValues = romanNumeral.calculateVale();
        Assertions.assertEquals(1499,addedValues);
    }

}
