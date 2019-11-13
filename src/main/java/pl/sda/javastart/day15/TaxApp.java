package pl.sda.javastart.day15;

import java.util.Scanner;

public class TaxApp {


    public static void main(String[] args) {


        System.out.println("Please enter an amount: ");
        Scanner scanner = new Scanner(System.in);
        int amountToCalculate = scanner.nextInt();
        showNationalityMenu();
        int nationalityChoice = scanner.nextInt();
        calculateTaxAmount(amountToCalculate, nationalityChoice);
    }

    private static void calculateTaxAmount(int amountToCalculate, int nationalityChoice) {
        TaxCalculator taxCalculator = null;
        if (nationalityChoice == 1) {
            taxCalculator = new PolishTaxCalculator();
        } else if (nationalityChoice == 2) {
            taxCalculator = new RussianTaxCalculator();
        } else if (nationalityChoice == 3) {
            taxCalculator = new SpanishTaxCalculator();
        }
        if (taxCalculator == null) {
            System.out.println("Wrong nationality number");
            return;
        }
        int amountWithaTax = taxCalculator.calculateTax(amountToCalculate);
        System.out.println("Calculated amonut : " + amountWithaTax);
    }

    private static void showNationalityMenu() {
        System.out.println("Choose nationality : ");
        System.out.println("1.Poland");
        System.out.println("2.Russian");
        System.out.println("3.Spain");
    }
}
