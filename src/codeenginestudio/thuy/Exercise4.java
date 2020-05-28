package codeenginestudio.thuy;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        String[] listA = {"a", "b", "c", "d"};
        String[] listB = {"d", "e"};

        Set<String> ouput1 = findDuplicate(listA, listB);
        List<String> ouput2 = mergeArray(listA, listB, POSITION);

        System.out.println("Ouput 4A: " + ouput1);
        System.out.println("Ouput aB: " + ouput2);

    }

    private static Set<String> findDuplicate(String[] listA, String[] listB) {
        Set<String> duplicates = new LinkedHashSet<>();
        Set<String> uniques = new HashSet<>(Arrays.asList(listA)); // add listA to uniques HashSet

        for (String word : listB) {
            if (!uniques.add(word)) { // if listB[i] is added to HashSet it mean listB[i] doesnt duplicate element
                duplicates.add(word);
            }
        }

        return duplicates;
    }

    private static List<String> mergeArray(String[] listA, String[] listB, int position) {
        List<String> aList = new ArrayList<String>(Arrays.asList(listA));
        Collections.reverse(Arrays.asList(listB));

        for (int i = 0; i < listB.length; i++) {
            aList.add(position, listB[i]);
        }

        return checkDuplicates(aList);
    }

    private static List<String> checkDuplicates(List<String> aList) {
        List<String> newList = new ArrayList<String>();

        for (String word : aList) {
            if (!newList.contains(word)) {
                newList.add(word);
            }
        }

        return newList;
    }

    public static final int POSITION = 1;

}
