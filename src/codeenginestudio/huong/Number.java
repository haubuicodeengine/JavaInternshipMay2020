package codeenginestudio.huong;

public abstract class Number implements INumber {

    private int num;

    protected Number(int num){
        this.num = num;
    }

    protected int getNum(){
        return this.num;
    }

    protected int valueOf(){
        return num;
    }

    public static int parse(String input, int coefficient){
        String parseAble = input.replace(SIGN,"");
        return Integer.parseInt(parseAble, coefficient);
    }

    protected static final String SIGN = "0x";

    protected static final int HEXADECIMAL_COEFFICIENT = 16;

    protected static final int OCTAL_COEFFICIENT = 8;
}
