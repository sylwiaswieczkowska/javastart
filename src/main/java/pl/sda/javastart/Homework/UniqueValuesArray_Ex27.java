package pl.sda.javastart.Homework;

import java.util.Arrays;

public class UniqueValuesArray_Ex27 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueValuesArrays(new int[]{1, 2, 4, 2, 5, 6}, new int[]{7, 9, 3, 2, 5, 2, 6})));

    }
    private static int[] uniqueValuesArrays(int[] firstTab, int[] secondTab) {
        System.out.println("Zwraca tablicę zawierającą posortowane unikatowe wartości przekazanych tablic ");
       int[] twoTable = new int[firstTab.length + secondTab.length];
        for (int i = 0; i <firstTab.length ; i++) {
            twoTable[i] = firstTab[i];
        }
        for (int i = firstTab.length ; i < twoTable.length; i++) {
            twoTable[i] = secondTab[i- (firstTab.length)];
        }
        Arrays.sort(twoTable);
        int end = twoTable.length;
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (twoTable[i] == twoTable[j]) {
                    int shiftLeft = j;
                    for (int k = j + 1; k < end; k++, shiftLeft++) {
                        twoTable[shiftLeft] = twoTable[k];
                    }
                    end--;
                    j--;
                }
            }
        }
        int[] resultTab = new int[end];
        for (int i = 0; i < end; i++) {
          resultTab[i] = twoTable[i];
        }
        return resultTab;
    }
}
