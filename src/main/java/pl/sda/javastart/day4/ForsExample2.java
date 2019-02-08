package pl.sda.javastart.day4;

public class ForsExample2 {
    public static void main(String[] args) {
        printNumbersInTree(3);
        printNumbersTree2(3);
    }
    public static void printNumbersInTree(int height) {
        for (int i = 0; i < height; i++) {//ilosc wierszy
            for (int j = 0; j <= i; j++) {//ilosc kolumn
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
    public static void printNumbersTree2(int height) {
        for (int i = 1; i <= height; i++) {
            for (int k = height - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
