package codeenginestudio.thuy;

public class Hex extends Numeral {

    public Hex(int number) {
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
        Hex hex = (Hex) ob;

        return getNumber() == hex.getNumber();
    }

    @Override
    public Hex minus(int i) {
        return new Hex(getNumber() - i);
    }

    public Hex minus(Hex hex) {
        return new Hex(getNumber() - hex.getNumber());
    }

    @Override
    public Hex plus(int i) {
        return new Hex(getNumber() + i);
    }

    public Hex plus(Hex hex) {
        return new Hex(getNumber() + hex.getNumber());
    }

    @Override
    public String toString() {
        return Contants.START_LETTER + Integer.toHexString(getNumber()).toUpperCase();
    }
}
