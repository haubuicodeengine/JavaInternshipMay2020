package codeenginestudio.huong;


public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        String input = "Hey fellow warriors";
        System.out.println("input  : " + input);
        System.out.println("output : " + exercise2.reversedSomeWords(input));
    }

    private boolean checkLength(String input, int boundaryMax) {
        if (input.length() >= boundaryMax) {
            return true;
        }
        return false;
    }

    public String joinArrayToString(String[] strArray) {
        return String.join(SPACE, strArray);
    }

    public String reversedSomeWords(String input) {
        String[] strInput = spiltStringToArray(input);

        for (int i = 0; i < strInput.length; i++) {
            if (checkLength(strInput[i], BOUNDARY_MAX)) {
                reverseWord(strInput, i);
            }
        }

        return joinArrayToString(strInput);
    }

    private static void reverseWord(String[] strArray, int index) {
        char[] arrWord = strArray[index].toCharArray();
        char[] newArrWord = new char[arrWord.length];

        for (int i = 0; i <= arrWord.length - 1; i++) {
            newArrWord[arrWord.length - i - 1] = arrWord[i];
        }

        strArray[index] = String.valueOf(newArrWord);
    }

    private String[] spiltStringToArray(String input) {
        return input.split(SPLIT_SPACE);
    }

    private static final Integer BOUNDARY_MAX = 5;

    private static final String SPACE = " ";

    private static final String SPLIT_SPACE = "\\s";
}