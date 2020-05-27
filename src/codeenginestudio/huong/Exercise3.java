package codeenginestudio.huong;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 exer3 = new Exercise3();
        exer3.display(exer3.generate2dArray(SIZE));
        exer3.display(exer3.invertElementsWithFormula(SIZE));
        exer3.display(exer3.invertElementsWithFor(SIZE));
    }

    public void display(int[][] arr) {

        for (int q = 0; q < arr.length; q++) {

            for (int i = 0; i < arr.length; i++) {
                System.out.print(TAB + arr[q][i]);
            }

            System.out.println();
        }

        System.out.println("end");
    }

    public int[][] generate2dArray(int size) {
        int[][] list = new int[size][size];

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                if (j == 0) {
                    list[i][0] = i + 1;
                } else {
                    list[i][j] = list[i][j - 1] + size;
                }
            }

        }

        return list;
    }

    public int[][] invertElementsWithFormula(int size) {
        int[][] originArr = generate2dArray(size);

        for (int j = 1; j < originArr[1].length - 1; j++) {

            for (int i = 1; i < originArr[i].length - 1; i++) {
                originArr[i][j] = i * size + 1 + j;
            }

        }

        return originArr;
    }

    public int[][] invertElementsWithFor(int size) {
        int[][] originArr = generate2dArray(size);
        invertIncreaseI(originArr);
        invertDecreaseI(originArr);
        return originArr;
    }

    public void invertIncreaseI(int[][] originArr) {
        for (int i = FIRST_POSITION; i < originArr[i].length - 1; i++) {
            swap(originArr, FIRST_POSITION, i);
        }

    }

    public void invertDecreaseI(int[][] originArr) {
        int startPoint = originArr[1].length - 1 - 1;

        for (int i = startPoint; i > 1; i--) {
            int endPoint = originArr[1].length - 1 - 1;
            swap(originArr, i, endPoint);
        }

    }

    public void swap(int[][] originArr, int index1, int index2) {
        int temp = originArr[index1][index2];
        originArr[index1][index2] = originArr[index2][index1];
        originArr[index2][index1] = temp;
    }

    private static final int SIZE = 5;

    private static final String TAB = "\t";

    private static final int FIRST_POSITION = 1;
}
