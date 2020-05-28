package codeenginestudio.thuy;

public class Main {
    public static void main(String[] args) {

        Hex hex = new Hex(255);
        Hex a = new Hex(3);

        Octal octal = new Octal(255);
        Octal b = new Octal(3);

        System.out.println("--------------Hex---------------");
        System.out.println(hex.toString());
        System.out.println(hex.valueOf() + 1);
        System.out.println(hex.equals(new Hex(255)));
        System.out.println(Numeral.parse(hex.toString(), Contants.HEX_NUMBER));
        System.out.println(Numeral.parse(hex.plus(a).toString(), Contants.HEX_NUMBER));
        System.out.println(Numeral.parse(hex.minus(a).toString(), Contants.HEX_NUMBER));

        System.out.println("--------------Octal---------------");
        System.out.println(octal.toString());
        System.out.println(octal.valueOf() + 1);
        System.out.println(octal.equals(new Octal(255)));
        System.out.println(Numeral.parse(octal.toString(), Contants.OCTAL_NUMBER));
        System.out.println(Numeral.parse(octal.plus(b).toString(), Contants.OCTAL_NUMBER));
        System.out.println(Numeral.parse(octal.minus(b).toString(), Contants.OCTAL_NUMBER));
    }
}
