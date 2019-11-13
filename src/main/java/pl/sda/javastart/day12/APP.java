package pl.sda.javastart.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class APP {
    private final static Random RANDOM = new Random();
    private static List<Person> createdPerson = new ArrayList<>();
    private static List<Food> createdFoods = new ArrayList<>();

    public static void main(String[] args) {

        for (Person person : createdPerson) {
            System.out.println("Person " + "\n" + person.getAnimal());
        }
        populateFood(50);

        IntStream.range(0, 5)
                .mapToObj(i -> "12345678" + i)
                .map(APP::createPerson)
                .forEach(createdPerson::add);

        createdPerson.forEach(Person::feed);

        createdPerson.stream()
                .map(Person::listOfHungryAnimals)
                .flatMap(List::stream)
                .map(Animal::getName)
                .forEach(System.out::println);
    }
    //  tworzenie osoby
    private static Person createPerson(String pesel) {
        int length = 5;
        List<Food> availabelFood = favFoodlist(length);
        List<Animal> animals = returnAnimalsList(pesel);
        return new Person(pesel, availabelFood, animals);
    }
    //  lista zwierzat, którą przechowuje człowiek
    public static List<Animal> returnAnimalsList(String owner) {
        int size = RANDOM.nextInt(5);
        return IntStream.range(0, size)
                .mapToObj(n -> "Animal " + n + " " + owner)
                .map(APP::createAnimal)
                .collect(Collectors.toList());
    }
    //  tworzenie zwierzaka
    private static Animal createAnimal(String name) {
        List<Food> favoriteFood = favFoodlist(8);
        return new Animal(name, favoriteFood);
    }
    //  lista jedzenia, którą przechowuje człowiek
    private static void populateFood(int size) {
        for (int i = 0; i < size; i++) {
            Food food = new Food("Food " + i);
            createdFoods.add(food);
        }
    }
    //  lista ulubionego jedzenia, którą przechowuje zwierz
    public static List<Food> favFoodlist(int length) {
        int size = RANDOM.nextInt(length);
        return IntStream.range(0, size)
                .map(i -> RANDOM.nextInt(createdFoods.size()))
                .mapToObj(createdFoods::get)
                .collect(Collectors.toList());
    }
}

