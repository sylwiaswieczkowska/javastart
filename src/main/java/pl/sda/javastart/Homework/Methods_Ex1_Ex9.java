package pl.sda.javastart.Homework;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Methods_Ex1_Ex9 {
    public static void main(String[] args) {
//        conversation();
        preciseValues();
        timeMethods();
        System.out.println(addingNumbers(1, 2, 3, 1));
//      Ex8 w folderze Day3, w klasie Homework
        printCubesOfNumbers(2, 6);
        countdown(8);
//      Ex8 w folderze Day3, w klasie Homework
        System.out.println(Arrays.toString(tableInReverseOrder(new int[]{1, 2, 3, 4, 5})));


    }

    private static void conversation() {
        System.out.println("Cześć. Jak się czujesz?");
        Scanner scanner = new Scanner(System.in);
        String frameOfMind = scanner.nextLine();
        System.out.println("Cieszę się, że czujesz się " + frameOfMind);
        System.out.println("Jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println("Ile masz lat?");
        String age = scanner.nextLine();
        System.out.println(name + " masz " + age + " lat");
        System.out.println("Ile masz wzrostu (dokładnie!)?");
        String height = scanner.nextLine();
        System.out.println(name + " masz " + height + " cm");
        System.out.println("A jak czujesz się teraz?");
        frameOfMind = scanner.nextLine();
        System.out.println("Cieszę się, że czujesz się " + frameOfMind);
    }

    private static void preciseValues() {
        System.out.println("Wyświetlanie z określoną precyzją");
        int x = 100;
        double pi = Math.PI;
        float n = 5.2f;
        System.out.printf("Printing simple integer: x =  %d", x);
        System.out.printf("\nFormatted with precison: PI = %.2f", pi);
        System.out.printf("\nFormatted to specific width: n = %.4f", n);
        n = 2324435.25f;
        System.out.printf("\nFormatted to right margin: n = %.4f", n);
        System.out.println();
    }

    //            3. Poprawcie zadanie z wypisywaniem minuty->lata dni itd
//
//
    private static void timeMethods() {
        LocalDateTime now = LocalDateTime.now();
        int minutes = now.getMinute();
        int hours = now.getHour();
        int year = now.getYear();
        int mounth = now.getMonthValue();
        int day = now.getDayOfMonth();
        if (mounth < 10 || day < 10) {
            System.out.println(hours + ":" + minutes + " 0" + day + ".0" + mounth + "." + year);
        } else {
            System.out.println(hours + ":" + minutes + " " + day + "." + mounth + "." + year);
        }
        int timeFromMidnight = (hours * 60) + minutes;
        System.out.println("Od północy mineło: " + timeFromMidnight + "minut");
        int percentOfDay = (100 * timeFromMidnight) / (24 * 60);
        System.out.println("Minęło już " + percentOfDay + "% dnia");
        int secondRemaindUntilEndOfDay = (24 * 60 * 60) - (timeFromMidnight * 60);
        System.out.println("Do końca dnia zostało " + secondRemaindUntilEndOfDay + "sekund");
    }

    private static int addingNumbers(int a, int b, int c, int x) {
        System.out.println("Metoda przyjmuje 4 parametry i zwraca wynik wynik równania: `a^(x) + b^(x+1) + c^(x+2)`.");
        Double result = Math.pow(a, x) + Math.pow(b, (x + 1)) + Math.pow(c, (x + 2));
        return result.intValue();
    }
    private static void printCubesOfNumbers(int min, int max) {
        System.out.println("Wyswietlenie kolejnych liczb z wybranego zakresu i ich sześcianów");
        int result = 0;
        for (int i = 0; i < max; i++) {
            result = (min + i) * (min + i) * (min + i);
            System.out.print("szećian liczby: " + (min + i) + " wynosi: " + result + ", ");
        }
        System.out.println();
    }

    private static void countdown(int value) {
        System.out.println("Odliczanie w dół po podaniu liczby startowej");
        if (value > 0) {
            for (int i = value; i >= 0; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("Podana wartość jest nieprawidłowa");
        }
    }

    private static int[] tableInReverseOrder(int[] table) {
        System.out.println("Nowa tablica z liczbami w odwrotnej kolejności");
        int[] reverseTable = new int[table.length];
        for (int i = 0; i < table.length; i++) {
            reverseTable[i] = table[(table.length - 1) - i];
        }
        return reverseTable;
    }
}
