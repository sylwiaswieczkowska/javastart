package pl.sda.javastart.day10;

public class MethodsWithStars {
    public static void main(String[] args) {
        lineWithStars(9);
        rectangleWithStars(9,4);
        signX(7);
        triangle(6);
        pyramidWithStars(6);

    }

    private static void lineWithStars(int a) {
        System.out.println("Linia z gwiazdek");
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void rectangleWithStars(int a, int b) {
        System.out.println("Prostokąt z gwiazdek");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void signX(int n) {
        System.out.println("Znak X z gwiazdek");
        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if ((i == -j) || (i == j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private static void triangle(int n) {
        System.out.println("Trójkąt prostokątny z gwiazdek");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                //if(i>=j){
                System.out.print("*");
                //}
            }
            System.out.println();
        }

    }
    private static void pyramidWithStars(int n) {
        System.out.println("Piramida z gwiazdek");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n + i; j++) {
                if (j < n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void patent(int n, char ch) {//metoda z petla z podstawa tworzenia jednego segmentu choinki
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
    }
    public static void christmasTreeSegment(int m) {//metoda z głównym mechanizmem tworzenia jednego segmentu choinki
        for (int i = 0; i < m; i++) {
            patent(m - i - 1, ' '); // z każdą linią o 1 mniej spacji (i)
            patent(2 * i + 1, '*'); // z każdą linią 2 razy wiecej gwiazdek
            System.out.println();
        }
    }
}
