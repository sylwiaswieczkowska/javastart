package pl.sda.javastart.Homework;

import java.util.Scanner;

public class Calculator_Ex34_CaughtSpeeding_Ex33 {
    public static void main(String[] args) {
        calculator();
        caughtSpeeding(74,true);

    }
    private static void caughtSpeeding(int speed, Boolean policemanMood){
        System.out.println("Metoda pokazująca wartość mandatu za pczekroczoną prędkość");
        if (policemanMood == true){
            if(speed <65){
                System.out.println("Miałeś szczęscie, ze wzgledu na dobry humor policjanta wartość mandatu wynosi 100zł.");
            }else if(speed >= 65|| speed < 75){
                System.out.println("Miałeś szczęscie, ze wzgledu na dobry humor policjanta wartość mandatu wynosi 200zł.");
            }else if(speed <= 75){
                System.out.println("Miałeś szczęscie, ze wzgledu na dobry humor policjanta wartość mandatu wynosi 300zł.");
            }

        }else if(policemanMood != true){
            if(speed < 60){
                System.out.println("Wartość mandatu wynosi 100zł.");
            }else if(speed >=60 || speed < 70){
                System.out.println("Wartość mandatu wynosi 200zł.");
            }else if(speed <= 70){
                System.out.println("Wartość mandatu wynosi 300zł.");
            }
        }
    }
    private static void calculator(){
        System.out.println("Kalkulator.");
        System.out.println("Wprowadź pierwszą liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int firstValue = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę:");
        int secondValue = scanner.nextInt();
        System.out.println("Wybierz działanie, które chcesz wykonąć: \n 1. Dodawania" +
                "\n 2. Odejmowanie" + "\n 3. Mnożenie" + "\n 4. Dzielenie");
        int selectedAction = scanner.nextInt();
        if(selectedAction == 1){
            System.out.println("Suma wynosi: " + firstValue + secondValue);
        }else if(selectedAction == 2){
            System.out.println("jeżeli chcesz odjąć pierwszą liczbę od drugiej wybierz: 1, jeżeli od drugiej pierwszą wybierz: 2.");
            int selectedAction2 = scanner.nextInt();
            if (selectedAction2 == 1){
                System.out.println("Różnica wynosi: " + (firstValue - secondValue));
            }else if(secondValue == 2) {
                System.out.println("Różnica wynosi: " + (secondValue - firstValue));
            }else{
                System.out.println("Nieprawidłowy wybór działania.");
            }
        }else if(selectedAction == 3){
            System.out.println(" Iloczyn wynosi: " + (firstValue * secondValue));
        }else if(selectedAction == 4){
            System.out.println("Jeżeli chcesz podzielić pierwszą liczbę przez drugą wybierz: 1, jeżeli drugą przez przez pierwszą wybierz: 2.");
            int selectedAction2 = scanner.nextInt();
            if (selectedAction2 == 1){
                System.out.println("Iloraz wynosi: " + (firstValue / secondValue ));
            }else if(selectedAction2 == 2){
                System.out.println("Iloraz wynosi: " + (secondValue / firstValue));
            }else {
                System.out.println("Nieprawidłowy wybór działania.");
            }
        }else {
            System.out.println("Nieprawidłowy wybór działania. ");
        }
    }
}
