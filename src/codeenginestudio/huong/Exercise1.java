package codeenginestudio.huong;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        String str = "tha7t is2 pa6 Thi1s T4est 3a th5";
        System.out.println(exercise1.sortString(str));
    }

    public char[] convertStringToArray(String str) {
        return str.toCharArray();
    }

    public boolean isNumeric(char input) {
        try {
            Integer.parseInt(String.valueOf(input));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int findNumber(char[] Arr) {
        int num = 0;

        for (int i = 0; i < Arr.length; i++) {
            if (isNumeric(Arr[i])) {
                num = Integer.parseInt(String.valueOf(Arr[i]));
                return num;
            }
        }

        return num;
    }

    public String joinArrayToString(String[] strArray) {
        return String.join(SPACE, strArray);
    }

    public String sortString(String str) {
        String[] strArray = splitStringToArray(str);

        for (int i = 0; i < strArray.length - 1; i++) {

            for (int j = 0; j < strArray.length - 1; j++) {
                char[] itemArray1 = convertStringToArray(strArray[j]);
                char[] itemArray2 = convertStringToArray(strArray[j + 1]);
                if (findNumber(itemArray1) > findNumber(itemArray2)) {
                    swap(strArray, j);
                }
            }

        }

        return joinArrayToString(strArray);
    }

    public String[] splitStringToArray(String str) {
        return str.split(SPLIT_SPACE);
    }

    public void swap(String[] inputArr, int indexSwap) {
        String temp = null;
        temp = inputArr[indexSwap];
        inputArr[indexSwap] = inputArr[indexSwap + 1];
        inputArr[indexSwap + 1] = temp;
    }

    private static final String SPLIT_SPACE = "\\S";

    private static final String SPACE = " ";
}
