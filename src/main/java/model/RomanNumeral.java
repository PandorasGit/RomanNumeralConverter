package model;

import java.util.Locale;

public class RomanNumeral {

    private final String numeralString;
    public int numeralInt;
    public RomanNumeral nextNumeral=null;

    public RomanNumeral(String numeralString) {
        this.numeralString = numeralString.toUpperCase(Locale.ROOT);
        this.numeralInt=convertInt();
    }


    public int calculateVale() {

        if(nextNumeral==null){
            return numeralInt;
        }
        else if(numeralInt >= nextNumeral.numeralInt){
            return add();
        }
        else {
            return subtract();
        }


    }

    private int add(){
        return numeralInt + nextNumeral.calculateVale();
    }

    private int subtract(){
        return nextNumeral.numeralInt-numeralInt+(nextNumeral.calculateVale()-nextNumeral.numeralInt);
    }

    private int convertInt() {

        return switch (numeralString) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };
    }
}
