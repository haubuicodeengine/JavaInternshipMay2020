package codeenginestudio.thuy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        int[][] ouput = invertMiddleElementFromColToRow(LENGTH_ARRAY);
        System.out.println(Arrays.deepToString(ouput));
    }

    private static boolean checkMiddleElement(int number, int n) {
        List<Integer> middleElement = findMiddleElement(n);

        return middleElement.contains(number);
    }

    private static List findMiddleElement(int n) {
        int[][] array = show2DArray(n);
        List<Integer> middleElementList = new ArrayList();

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                middleElementList.add(array[i][j]);
            }
        }

        return middleElementList;
    }

    private static int[][] invertMiddleElementFromColToRow(int n) {
        int[][] array = show2DArray(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (checkMiddleElement(array[i][j], n)) {
                    int x = i * n + 1 + j;
                    array[i][j] = x;
                }
            }
        }

        return array;
    }

    private static int[][] show2DArray(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = 0;
                if (j == 0) {
                    x = i + 1;
                } else {
                    x = array[i][j - 1] + n;
                }
                array[i][j] = x;

            }
        }

        return array;
    }

    private static final Integer LENGTH_ARRAY = 5;
}
