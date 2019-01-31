package pl.sda.javastart.day10;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        Integer[] tab = new Integer[]{2, 5, 4, 1, 7};
        int[] tab2 = new int[]{5, 2, 3};
        StackExample stack = new StackExample();
        stack.push(5);
        stack.push(8);
        stack.push(10);
        stack.peek();
        stack.pop();
        stack.peek();
        System.out.println(lineSearch(4, tab));
        lineSearchOpty(tab2,5);
        System.out.println(Arrays.toString(sumTab(new int[] {3,5,6,7},new int[] {9,8,7,4,3,6})));
        System.out.println(Arrays.toString(random(9,3,9)));
        System.out.println(Arrays.toString(fibonacciArray(8)));

    }
    public static void lineSearchOpty(int[] tab, int search) {
        System.out.println("Szukanie liczby w tablicy");
        Integer index = null;
        for (int i = 0, j = tab.length - 1; i < j; i++, j--) {
            if (tab[i] == search) {
                index = i;
                break;
            }
            if (tab[j] == search) {
                index = j;
                break;
            }
        }
        System.out.println("Szukanie elementu " + search);
        System.out.println(index == null ? "Brak szukanego elementu w tablicy"
                : "Element " + search + " znajduję sie w miejscu o indeksie " + index);
    }
    private static int lineSearch(Object o, Object[] tab) {
        System.out.println("Szukanie liczby w tablicy");
        for (int i = 0; i < tab.length; i++) {
            if (o.equals(tab[i])) {
                return i;
            }
        }
        return -1;
    }
    private static int lineSearch(Object o, List<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            if (o.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }
    private static int[] sumTab(int[] a, int[] b) {
        System.out.println("Suma liczb o tym samym ideksie, dwóch tablic");
        int[] sum;
        boolean aGreater = a.length > b.length ? true : false;
        sum = new int[aGreater ? a.length : b.length];
        for (int i = 0; i < sum.length; i++) {
            if (aGreater) {
                if (i < b.length) {
                    sum[i] = a[i] + b[i];
                } else {
                    sum[i] = a[i];
                }
            } else {
                if (i < a.length) {
                    sum[i] = a[i] + b[i];
                } else {
                    sum[i] = b[i];
                }
            }
        }
        return sum;
    }
    private static int[] random(int size, int min, int max) {
        System.out.println("Tablica losowo wybranych licz z podanego przedziału");
        int[] tab = new int[size];
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.ints(min, max + 1).findFirst().getAsInt();
        }
        return tab;
    }
    private static long[] fibonacciArray(int a) {
        System.out.println("Ciąg Fibonacciego");
        long[] tab = new long[a];

        for (int i = 0; i < tab.length; i++) {
            if (i < 2) {
                tab[i] = 1;
            } else {
                tab[i] = tab[i - 2] + tab[i - 1];
            }
        }
        return tab;
    }
}
