package pl.sda.javastart.Homework;

public class Methods_Ex35_38 {
    public static void main(String[] args) {
        rectangleMethod_Ex38(8, 4);
        System.out.println(sumElementsWithoutMax_Ex37(new int[]{4, 6, 9, 3, 6}));
        numberToGivenPower(2,9);
        multiplicationTable(8);

    }
    private static void multiplicationTable(int size){
        System.out.println("Tabliczka mnożenia o podanym rozmiarze.");
        for (int i = 1; i <= size ; i++) {
            System.out.print("\t" + i);
        }
        System.out.println("\n----------------------------------");
        for (int i = 1; i <= size; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <= size ; j++) {
                System.out.print("\t" + i*j);
            }
            System.out.println();
        }
    }
       private static void numberToGivenPower(int value, int power) {
        System.out.println("Metoda wyświetlająca wszystkie potęgi podanej liczyby do momentu przekroczenia drugiel liczby.");
        for (int i = 1; i <= power; i++) {
            Double valueToPower = Math.pow(value, i);
            System.out.print(value + " ^ "+ i + " = " + valueToPower.intValue() + ", ");
        }
           System.out.println();
    }
    private static int sumElementsWithoutMax_Ex37(int[] tab) {
        System.out.println("Suma elementów tablicy z pominięciem Max wartości.");
        int max = tab[0];
        int sum = 0;

        for (int element : tab) {
            if (element > max) {
                max = element;
            }
            int counter = 0;
            sum = element + sum;
            counter++;
        }
        return sum - max;
    }
    private static void rectangleMethod_Ex38(int width, int high) {
        System.out.println("Metoda wyświetlająca prostokąt z X.");
        for (int i = 1; i <= high; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == high || j == 1 || j == width) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}




