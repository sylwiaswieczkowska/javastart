package pl.sda.javastart.Homework;

import java.util.Arrays;

public class Methods_Ex32_25 {
    public static void main(String[] args) {
        numberLessThanZero(-8, 7, -5, 0, 9);
        System.out.println(ifAnyNuberIsLessThanZero(-3,1));
        System.out.println(ifSumOfTwoGivesThird(4,7,9));
        ifAnySumOfTwoGivesThird(3,5,8);
        System.out.println(ifNumbersAreEven(9,8));
        System.out.println(Arrays.toString(tableIncreasedByOneNumber(new int[]{2,4,5,7,3},8)));
        System.out.println(Arrays.toString(sumOfTwoTables(new int[]{6,3,9,8},new int[]{7,3,2,8,9})));
        christmasTree(10);

    }
    private static void christmasTree(int height){
        System.out.println("Choinka");
        for (int i = 1; i <= height ; i++) {
            for (int j = height ; j>=i ; j--) {
                System.out.print(".");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }for (int j = 1; j <i ; j++) {
                System.out.print(i-j);
            }for (int j = i; j <=height; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
    private static int[] sumOfTwoTables( int[] firstTable, int[] secondTable){
        System.out.println("Metoda zwracajaca tablicę będacą efektem połczenia dwóch tablic.");
        int[] newTable = new int [firstTable.length + secondTable.length];
        for (int i = 0; i <firstTable.length; i++) {
            newTable[i] = firstTable[i];
        }
        for (int i = firstTable.length ; i < newTable.length; i++) {
          newTable[i] = secondTable[i - firstTable.length];
        }
        return newTable;
    }
    private static int[] tableIncreasedByOneNumber(int[] table, int number){
        System.out.println("Metoda zwracająca tablicę z dopisaną liczbą.");
        int[] newTable = new int[table.length + 1];
        for (int i = 0; i <table.length ; i++) {
            newTable[i] = table[i];
            newTable[table.length] = number;
        }
        return newTable;
        }
        private static boolean  ifNumbersAreEven(int firstNumber,int secondNumber){
        System.out.println("Metoda zwracająca informację czy obydwie liczby są parzyste.");
        if(firstNumber % 2 == 0 && secondNumber % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    private static void ifAnySumOfTwoGivesThird(int firstNumber, int secondNumber, int thirdNumber){
        System.out.println("Metoda zwracająca informację czy suma dwóch liczb daje trzecią.");
        if(firstNumber + secondNumber == thirdNumber){
            System.out.println("Suma dwówch pierwszych liczb daje trzecia.");
        }else if(secondNumber + thirdNumber == firstNumber){
            System.out.println("Suma drugiej i trzeciej liczby  daje pierwsza.");
        }else if(firstNumber + thirdNumber == secondNumber){
            System.out.println("Suma pierwszej i trzeciej liczby daje drugą.");
        }else{
            System.out.println("Z podanych liczb, suma jakichkolwiek dwóch nie daje trzeciej. ");
        }

    }
    private static boolean ifSumOfTwoGivesThird(int firsyNumber, int secondNumber, int thirdNumber){
        System.out.println("Metoda zwracająca informację czy suma pierwszych dwóch liczb daje trzecią.");
        if(firsyNumber + secondNumber == thirdNumber){
            return true;
        }else{
            return false;
        }
    }
    private static boolean ifAnyNuberIsLessThanZero(int firstValue, int secondValue){
        System.out.println("Metoda sprawdzająca czy chociaz jedna z podanych liczb jest wieksza od zera");
        if(firstValue > 0 || secondValue > 0){
            return true;
        }else {
            return false;
        }
    }
    private static void numberLessThanZero(int a, int... args) {
        System.out.println("Wartości mniejsz od zera: ");
        if(a < 0){
            System.out.print(a + ", ");
        }
        for (int arg : args) {
            if (arg < 0) {
                System.out.print(arg + ", ");
                       }
        }
        System.out.println();
    }
}
