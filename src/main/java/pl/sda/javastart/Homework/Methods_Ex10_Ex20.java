package pl.sda.javastart.Homework;

import java.util.Scanner;

public class Methods_Ex10_Ex20 {
    public static void main(String[] args) {

//        downloadFiveDifferentNumbers();
//        evenOrOddNumberFor();
//        evenOrOddNumberWhile();
//        evenOrOddNumberWhileDo();
//        System.out.println(sumOfNumbersFromRange(new int[]{4, 3, 2, 2, 3, 3}, 2, 4));
//         Ex_14 i Ex_15 w folderze day4, klasie ForsExample2
//         Ex_16 day3, w klasie WhileExample
//        numberToPower(2, 3);
//        numbersUndividedByThree();
//        strengthGivenNumber(12);
//        doWhileCalculator();
        switchWelcome();
    }
    private static void downloadFiveDifferentNumbers() {
        int[] table = new int[5];
        int sum = 0;
        int max = 0;
        int min = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < table.length; i++) {
            System.out.println("Wprowadź liczbę: ");
            table[i] = scanner.nextInt();
        }
        for (int i = 0; i < table.length; i++) {
            sum = sum + table[i];
        }
        min = table[0];
        max = table[0];
        for (int element : table) {
            if (max < element) {
                max = element;
            }
            if (min > element) {
                min = element;
            }
        }
        System.out.println("Suma podanych liczb wynosi: " + sum + ", najwieksza liczba to: " + max + ", najmniejsza to: " + min);
    }
    private static void evenOrOddNumberFor() {
        System.out.println("Metoda z for, zaznacza przy liczbie, czy jest to liczba parzysta, czy nieparzysta.");
        int number = 0;
        for (int i = 0; i < 20; i++) {
            number = 1 + i;
            if (number % 2 == 0) {
                System.out.println(number + " liczba parzysta ");
            } else {
                System.out.println(number + " liczba nieparzysta ");
            }
        }
    }
    private static void evenOrOddNumberWhile() {
        System.out.println("Metoda z while, zaznacza przy liczbie, czy jest to liczba parzysta, czy nieparzysta.");
        int number = 0;
        int counter = 0;
        while (counter < 20) {
            number = counter + 1;
            if (number % 2 == 0) {
                System.out.println(number + " liczba parzysta ");
            } else {
                System.out.println(number + " liczba nieparzysta ");
            }
            counter++;
        }
    }
    private static void evenOrOddNumberWhileDo() {
        System.out.println("Metoda z while do, zaznacza przy liczbie, czy jest to liczba parzysta, czy nieparzysta.");
        int number = 0;
        int counter = 0;
        do {
            number = counter + 1;
            counter++;
            if (number % 2 == 0) {
                System.out.println(number + " liczba parzysta ");
            } else {
                System.out.println(number + " liczba nieparzysta ");
            }
        } while (counter < 20);
    }
    private static int sumOfNumbersFromRange(int[] table, int numberFrom, int numberTo) {
        System.out.println("Suma liczb z podanego zakresu.");
        int sum = 0;
        if (numberTo > table.length) {
            for (int i = numberFrom; i < table.length; i++) {
                sum = sum + table[i];
            }
        } else {
            for (int i = numberFrom; i <= numberTo; i++) {
                sum = sum + table[i];
            }
        }
        return sum;
    }
    private static void numberToPower(int firstNumber, int secondNumber) {
        System.out.println("Wszystkie potęgi pierwszej liczby do momentu przekroczenia drugiej liczby. ");
        for (int i = 1; i <= secondNumber; i++) {
            Double numberToPower = Math.pow(firstNumber, i);
            System.out.print(numberToPower.intValue() + ", ");
        }
        System.out.println();
    }
    private static void numbersUndividedByThree() {
        System.out.println("Liczby całkowite od 1 do 20 niepodzielne przez 3.");
        int number = 1;
        while (number <= 20) {
            if (number % 3 == 0) {
                System.out.print(number + ", ");
            }
            number++;
        }
          System.out.println();
    }
    private static void strengthGivenNumber(int number){
        System.out.println("Oblicza silnię dla zadanej liczby przez użytkownika.");
        int counter = 1;
        int strong = 1;
        while(counter <= number){
            strong = counter * strong;
            counter++;
        }
        System.out.println(number + "! wynosi " + strong);
    }
    private static void doWhileCalculator(){
        System.out.println("Kalkulator.");
        System.out.println("Wprowadź pierwszą liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int firstValue = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę:");
        int secondValue = scanner.nextInt();
        System.out.println("Jeżeli chcesz wykonać działania na liczbach wybierz +, jeżli chcesz zakończyć wybierz -");
         scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
     do {
         System.out.println("Wybierz działanie, które chcesz wykonąć: \n 1. Dodawania" +
                 "\n 2. Odejmowanie" + "\n 3. Mnożenie" + "\n 4. Dzielenie");
         scanner = new Scanner(System.in);
         int selectedAction = scanner.nextInt();
         if (selectedAction == 1) {
             System.out.println("Suma wynosi: " + firstValue + secondValue);
         } else if (selectedAction == 2) {
             System.out.println("jeżeli chcesz odjąć pierwszą liczbę od drugiej wybierz: 1, jeżeli od drugiej pierwszą wybierz: 2.");
             int selectedAction2 = scanner.nextInt();
             if (selectedAction2 == 1) {
                 System.out.println("Różnica wynosi: " + (firstValue - secondValue));
             } else {
                 System.out.println("Różnica wynosi: " + (secondValue - firstValue));
             }
         } else if (selectedAction == 3) {
             System.out.println(" Iloczyn wynosi: " + (firstValue * secondValue));
         } else if (selectedAction == 4) {
             System.out.println("Jeżeli chcesz podzielić pierwszą liczbę przez drugą wybierz: 1, jeżeli drugą przez przez pierwszą wybierz: 2.");
             int selectedAction2 = scanner.nextInt();
             if (selectedAction2 == 1) {
                 System.out.println("Iloraz wynosi: " + (firstValue / secondValue));
             } else if (selectedAction2 == 2) {
                 System.out.println("Iloraz wynosi: " + (secondValue / firstValue));
             } else {
                 System.out.println("Nieprawidłowy wybór działania.");
             }
         } else {
             System.out.println("Nieprawidłowy wybór działania. ");
         }
     }while (choice == "+");
     while (choice == "-"){
            System.out.println("Koniec");
        }
    }
    private static void switchWelcome(){
        System.out.println("Wybierz jezyk powitania :\n PL- j.polski, \n EN- j.angielski, \n DE- j.niemiecki, \n FR- j.francuski");
        Scanner scanner = new Scanner(System.in);
        String welcome = scanner.nextLine();
        switch (welcome ){
            case "PL":
                System.out.println("Dzień dobry. Witam serdecznie!");
                break;
            case "EN":
                System.out.println("Good morning. Welcome!");
                break;
            case "DE":
                System.out.println("Guten Morgen. Herzlich Willkommen!");
                break;
            case "FR":
                System.out.println("Bonne matin. Bienvenue!");
                break;
                default:
                    System.out.println("Good morning. Welcome!");
        }
    }
}