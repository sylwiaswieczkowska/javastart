package pl.sda.javastart.day11;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main_day11 {
    public static void main(String[] args) {
        customList();
        arrayWithRandom(9);
        CustomStack<String> customStack= new CustomStack<>();
        customStack.push("ok");
        customStack.push("ok");
        customStack.push("ok");
        customStack.push("ok");
        customStack.push("ok");




    }
    private static void customList() {
        CustomList<Zwierze> zwierzeCustomList = new CustomList<>();
        Zwierze pies = new Pies();
        Zwierze ptak = new Ptak();
        zwierzeCustomList.add(pies);
        zwierzeCustomList.add(ptak);
        System.out.println(zwierzeCustomList.get(0).getType());
        System.out.println(zwierzeCustomList.size());
        zwierzeCustomList.remove(1);
        System.out.println(zwierzeCustomList.size());
    }
    public static void arrayWithRandom(int size) {
        Integer[] tab = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            tab[i] = random.nextInt(50);
        }
        Integer previous = null;
        for (int i = 0; i < tab.length; i++) {
            if (previous == null) {
                previous = tab[i];
            } else {
                if (previous > tab[i]) {
                    System.out.println("Nie jest posortowana");
                    break;
                } else {
                    previous = tab[i];
                }
            }
        }
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
    }
}
