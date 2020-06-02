package codeenginestudio.thuy;

import java.util.*;

public class Exercise1 {

    public static void main(String[] args) {
        String input = "is2 Thi1s first4 J5ava T6est 3the";
        String ouput = convertArrayToString(sortStringcontainsNumber(input));
        System.out.println("Output: " + ouput);
    }

    public static String convertArrayToString(String[] array) {
        return String.join(Constants.SPACE, array);
    }

    public static String[] createArrayFromMapWords(Map<Integer, String> mapWords) {
        String[] newArray = new String[mapWords.size()];

        for (int i = 0; i < mapWords.size(); i++) {
            newArray[i] = mapWords.get(i + 1);
        }

        return newArray;
    }

    public static int getNumberFromCharArrays(char[] inputArrays) {
        for (int i = 0; i < inputArrays.length; i++) {
            String numberInString = String.valueOf(inputArrays[i]);

            if (isNumeric(numberInString)) {
                return Integer.parseInt(numberInString);
            }
        }

        return Constants.DEFAULT_NUMBER;
    }

    public static boolean isNumeric(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Map<Integer, String> splitStringToMap(String input) {
        String[] wordArray = input.split(Constants.SPLIT_PATTERN);

        Map<Integer, String> result = new HashMap<>();

        for (String word : wordArray) {
            char[] charArrays = word.toCharArray();
            int number = getNumberFromCharArrays(charArrays);

            result.put(number, word);
        }

        return result;
    }

    public static String[] sortStringcontainsNumber(String input) {
        Map<Integer, String> mapWords = splitStringToMap(input);

        return createArrayFromMapWords(mapWords);
    }
}