package codeenginestudio.huong;

public class Octal extends Number {

    public Octal(int num) {
        super(num);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Octal octal = (Octal) o;
        return getNum() == octal.getNum();
    }

    @Override
    public Object minus(Object o) {
        Octal octal = (Octal) o;
        return new Octal(getNum() - octal.getNum());
    }

    @Override
    public Object minus(int input) {
        return new Octal(getNum() - input);
    }

    public static int parse(String input){
        String parseAble = input.replace(SIGN,"");
        return Integer.parseInt(parseAble, OCTAL_COEFFICIENT);
    }

    @Override
    public Object plus(Object o) {
        Octal octal = (Octal) o;
        return new Octal(getNum() + octal.getNum());
    }

    @Override
    public Object plus(int input) {
        return new Octal(getNum() + input);
    }

    @Override
    public String toString() {
        return SIGN + Integer.toOctalString(getNum());
    }
}
