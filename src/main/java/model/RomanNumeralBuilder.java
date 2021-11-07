package model;

public class RomanNumeralBuilder {

    private char[] numeralStringArray;

    public RomanNumeralBuilder(String numeralString) {
        this.numeralStringArray = numeralString.toCharArray();
    }

    public RomanNumeral buildRomanNumeral() {

        char initialCharacter = numeralStringArray[0];
        String initialString = String.valueOf(initialCharacter);
        RomanNumeral rootNumeral = new RomanNumeral(initialString);

        recursiveRomanNumeralBuilder(rootNumeral,1);
        return rootNumeral;
    }

    private void recursiveRomanNumeralBuilder(RomanNumeral romanNumeral,int index){
        if(index<numeralStringArray.length){

            String numeralString = String.valueOf(numeralStringArray[index]);
            RomanNumeral nextNumeral = new RomanNumeral(numeralString);
            romanNumeral.nextNumeral = nextNumeral;
            recursiveRomanNumeralBuilder(nextNumeral,index+1);

        }
    }
}
