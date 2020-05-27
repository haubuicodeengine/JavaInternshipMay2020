package codeenginestudio.huong;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        Exercise4 exer4 = new Exercise4();
        List<String> listA = new ArrayList<String>();
        listA.add("a");
        listA.add("b");
        listA.add("c");
        listA.add("d");
        List<String> listB = new ArrayList<String>();
        listB.add("e");
        listB.add("d");
        System.out.println("bai 1" + exer4.findDuplicate(listA, listB));
        System.out.println("bai 2" + exer4.mergeSpecificIndex(listA, listB, INDEX));
    }

    private List<String> findDuplicate(List<String> listA, List<String> listB) {
        List<String> checkedList = new ArrayList<String>();

        for (String temp : listA) {
            if (listB.contains(temp)) {
                checkedList.add(temp);
            }
        }

        return checkedList;
    }

    private void mergeList(List<String> willBeMerged, List<String> mergedList, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            willBeMerged.add(mergedList.get(i));
        }
    }

    private List<String> mergeSpecificIndex(List<String> arrMerged, List<String> arrToBeMerged, int index) {
        List<String> newList = new ArrayList<String>();
        mergeList(newList, arrMerged, FIRST_POSITION, index);
        mergeList(newList, arrToBeMerged, FIRST_POSITION, arrToBeMerged.size());
        mergeList(newList, arrMerged, index, arrMerged.size());
        return newList;
    }

    private static final int INDEX = 2;

    private static final int FIRST_POSITION = 0;

}
