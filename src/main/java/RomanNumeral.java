public class RomanNumeral {

    private String numeralString;
    private int numeralInt;
    private RomanNumeral nextNumeral=null;

    public RomanNumeral(String numeralString) {
        this.numeralString = numeralString;
    }

    public RomanNumeral next() {
        return nextNumeral;
    }
}
