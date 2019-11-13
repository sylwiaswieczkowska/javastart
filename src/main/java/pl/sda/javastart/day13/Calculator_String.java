package pl.sda.javastart.day13;

import java.util.Scanner;

public class Calculator_String {


    public static void main(String[] args) {

        System.out.println(plus("9+9+9 "));
        System.out.println(minus("6 -3 -4"));
        calculator();
    }

    private static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj działanie ");
        String input = scanner.nextLine();
        System.out.println(plus(input));


    }

    private static Double minus(String input) {
        String[] numbers = input.split("\\-");
        double difference = -1;
//        difference = 0; drugi sposób
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                if ("".equals(numbers[i].trim())) {
                    difference = 0;
//                    continue; drugi spsób
                } else {
                    difference = Double.valueOf(numbers[i].trim());
                }
            } else {
                difference = difference - Double.valueOf(numbers[i].trim());
            }
        }
        return difference;
    }

    private static double multiply(String input) {
        String[] numbers = input.split("\\*");
        double d = 1;
        for (int i = 0; i < numbers.length; i++) {
            d = d * Double.valueOf(numbers[i].trim());
        }
        return d;
    }

//    private static double divide(String input) {
//        String[] numbers = input.split("\\/");
//        return
//
//
//    }

    private static double plus(String input) {
        double sum = 0;
        String[] numbers = input.split("\\+");
        for (int i = 0; i < numbers.length; i++) {
            String t = numbers[i];
            if (t.contains("-")) {
                sum = sum + minus(t);
            } else if (t.contains("*")) {
                sum = sum + multiply(t);
            } else {
                sum = sum + Double.valueOf(t.trim());
            }
        }
        return sum;
    }
}