package codeenginestudio.thuy;

public class Octal extends Numeral {

    public Octal(int number) {
        this.setNumber(number);
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (ob == null || getClass() != ob.getClass()) {
            return false;
        }
        Octal octal = (Octal) ob;

        return getNumber() == octal.getNumber();
    }

    @Override
    public Octal minus(int i) {
        return new Octal(getNumber() - i);
    }

    public Octal minus(Octal octal) {
        return new Octal(getNumber() + octal.getNumber());
    }

    @Override
    public Octal plus(int i) {
        return new Octal(getNumber() + i);
    }

    public Octal plus(Octal octal) {
        return new Octal(getNumber() - octal.getNumber());
    }

    @Override
    public String toString() {
        return Contants.START_LETTER + Integer.toOctalString(getNumber()).toUpperCase();
    }

}