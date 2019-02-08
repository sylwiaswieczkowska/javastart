package pl.sda.javastart.Homework;

import java.math.BigDecimal;

public class UsableMethods_Ex6 {
    public static void main(String[] args) {
        String a = "tru";
        String b = "123456789987654320001000.0012654";
        System.out.println(stringToDouble("123"));
        System.out.println(isStringEmptyOrNull(a));
        System.out.println(stringToBigDecimal(b));
        System.out.println(fahrenheitToCelsius(212));
        System.out.println(kphToMph(125));
        System.out.println(kmhToMs(100));
        System.out.println(minsToQuaters(124));
    }

    private static double stringToDouble(String a) {
        System.out.println("Zamiana podanego napisu (z liczbą) na `double`");
//        return Double.parseDouble(a);
        return Double.valueOf(a);
    }

    private static boolean isStringEmptyOrNull(String a) {
        System.out.println("Sprawdzanie czy podany String jest pusty albo nullowy");
        return a == null || a.isEmpty();
    }

    private static BigDecimal stringToBigDecimal(String a) {
        System.out.println("Zamiana `String` na `BigDecimal`");
        return new BigDecimal(a);
    }

    private static double fahrenheitToCelsius(double a) {
        System.out.println("Zamiana podanej temperatury w stopniach `Fahrenheita` na `Celsiusza`");
        return (a - 32) / 1.8;
    }

    private static String kphToMph(double kph) {
        System.out.println("Zamiana podanej prędkości `km/h` (kilometrów na godzinę) na `mph` (mil na godzinę)");
        return kph * 0.62137 + " mph";
    }

    private static String kmhToMs(double kph) {
        System.out.println("Zamiana podanej prędkości `km/h` (kilometrów na godzinę) na `m/s` (metrów na sekundę)");
        return kph * (1000d / 3600d) + " m/s";
    }

    private static int minsToQuaters(int mins) {
        System.out.println("Zamiana podanej ilości minut na liczbę **pełnych** kwadransów");
        return mins / 15;
    }
}

