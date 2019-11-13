package pl.sda.javastart.day12;



import org.apache.commons.lang3.StringUtils;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {


        IntStream.range(0,10)
                .mapToObj(Animal::new)
                .map(Animal::getName )
                .map(StringUtils::capitalize)
                .forEach(System.out::println);

       String str = IntStream.range(0,20)
                .mapToObj(c -> mapToString(c))
                .collect(Collectors.joining(", ","{","}"));
        System.out.println(str);

    }
        public static String mapToString(int i){
        return String.format("'%d'", i);
    }
}
