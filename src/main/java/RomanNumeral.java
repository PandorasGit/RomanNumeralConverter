
public class RomanNumeral {

    private final String numeralString;
    public int numeralInt;
    public RomanNumeral nextNumeral=null;

    public RomanNumeral(String numeralString) {
        this.numeralString = numeralString;
        this.numeralInt=convertInt();
    }


    public int calculateVale() {
        if(nextNumeral==null){
            return numeralInt;
        }
        if(nextNumeral.numeralInt<=numeralInt){
            return numeralInt + nextNumeral.convertInt();
        }
        else{
            return subTract();
        }

    }

    private int subTract(){
        return (numeralInt - nextNumeral.numeralInt + (nextNumeral.calculateVale() - nextNumeral.numeralInt))*-1;
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
