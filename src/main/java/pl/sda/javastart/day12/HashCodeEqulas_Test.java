package pl.sda.javastart.day12;

import java.util.*;

public class HashCodeEqulas_Test {
    private Object object = new Object();
    private Map<Object, Object> map = new HashMap<>();
    private List<Object> keys = new ArrayList<>();

    public static void main(String[] args) {
        new HashCodeEqulas_Test().start();
    }
    private void start() {
        put();
        check();
        checkStream();
    }
    private void put() {
        for (int i = 0; i < 100; i++) {
            HashCodeEqualsOne hashCodeEqualsOne =
                    new HashCodeEqualsOne("fm" + i, "fm" + i, "fm" + i);
            map.put(hashCodeEqualsOne, object);
            keys.add(hashCodeEqualsOne);
        }
    }
    private void check() {
        int found = 0;
        int notFound = 0;
        for (int i = 0; i < keys.size(); i++) {
            if (map.get(keys.get(i)) == null) {
                notFound++;
            } else {
                found++;
            }
        }
        System.out.println("Found: " + found + ", notFound: " + notFound);
    }
    private void checkStream(){
        long found = keys.stream()
                .map(map::get)
                .filter(Objects::nonNull)
                .count();
        long notFound = keys.stream()
                .map(map::get)
                .filter(Objects::isNull)
                .count();
        System.out.println(String.format("Found: %d, not found: %d",found,notFound));
    }

}

