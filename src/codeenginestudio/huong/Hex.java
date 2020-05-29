package codeenginestudio.huong;

public class Hex extends Number{

    public Hex(int num){
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
        Hex hex = (Hex) o;
        return getNum() == hex.getNum();
    }

    @Override
    public Object minus(Object o) {
        Hex hex = (Hex) o;
        return new Hex(getNum() - hex.getNum());
    }

    @Override
    public Object minus(int input) {
        return new Hex(getNum() - input);
    }

    @Override
    public Object plus(Object o) {
        Hex hex = (Hex) o;
        return new Hex(getNum() + hex.getNum());
    }

    @Override
    public Object plus(int input) {
        return new Hex(getNum() + input);
    }

    @Override
    public String toString() {
        return SIGN + Integer.toHexString(getNum()).toUpperCase();
    }
}

