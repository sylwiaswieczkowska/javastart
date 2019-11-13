package pl.sda.javastart.day16;

import java.util.ArrayList;

public class ArrayExample {

    public static ArrayList<Digit> list;

    public static void main(String[] args) throws InterruptedException {

        ArrayExample.list = new ArrayList<>();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            list.add(new Digit(Integer.MAX_VALUE));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i % 1000 == 0) {
                System.gc();
                System.out.println(" Jestem Gc");
            }
        }
        System.out.println(list.size());
    }

 /*     System.out.println("The sum is: " + addNumberToArray(10));
    }
    private static int addNumberToArray(int size){
     size = 10;
        int sum = 0;
        int[] tab = new int[size];
        for (int i = 0; i < size; i++) {
            tab[i] = i + 1;
        }
        for (int i = 0; i < size; i++) {
            sum = sum + tab[i];
        }
        return sum;
    }*/
}

