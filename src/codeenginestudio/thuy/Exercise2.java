package codeenginestudio.thuy;

public class Exercise2 {

    public static void main(String[] args) {
        String input = "This is another test";
        String ouput = convertArraytoString(checkLength(input, MAX_LENGTH));
        System.out.println("ouput: " + ouput);
    }

    private static String[] checkLength(String input, int length) {
        String[] stringArray = splitString(input);

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() >= length) {
                stringArray[i] = reverseString(stringArray[i]);
            }
        }

        return stringArray;
    }

    private static String convertArraytoString(String[] stringArray) {
        return String.join(DEFAULT_STRING, stringArray);
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);

        return String.valueOf(sb.reverse());
    }

    private static String[] splitString(String input) {
        return input.split(SPLIT_PATTERN);
    }

    private static final String DEFAULT_STRING = " ";

    private static final Integer MAX_LENGTH = 5;

    private static final String SPLIT_PATTERN = "\\s";

}