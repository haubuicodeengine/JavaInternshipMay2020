package codeenginestudio.thuy;

public abstract class Numeral implements INumeral {

    private int number;

    public int getNumber() {
        return number;
    }

    public static int parse(String ob, int coefficient) {
        String replaceString = ob.replace(Contants.START_LETTER, Contants.DEFAULT_STRING);

        return Integer.parseInt(replaceString, coefficient);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int valueOf() {
        return getNumber();
    }

}
