package pl.sda.javastart.day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooApp {

    public static Scanner scanner = new Scanner(System.in);
    public static List<Animal> animalList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to the Zoo");
        zooMenu();
    }

    private static void zooMenu() {
        System.out.println("1. Show animals");
        System.out.println("2. Add animals");
        System.out.println("3. Delete animals");
        int menuChoise = scanner.nextInt();
        if (menuChoise == 1) {
            showAnimals();
            zooMenu();
        } else if (menuChoise == 2) {
            populateAnimalsList();
            zooMenu();
        } else if (menuChoise == 3) {
            deleteAnimal();
            zooMenu();
        }
    }

    private static void deleteAnimal() {
        System.out.println("Which animal do you want remove from list ? ");
        System.out.println("Enter name");
        String animalName = scanner.next();
        if (animalList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (Animal animal : animalList) {
                animalList.remove(animal);
            }
        }
    }


    private static void showAnimals() {
        if (animalList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (Animal animal : animalList) {
                System.out.println(animal.itroduceYourSelf());
            }
        }
    }

    private static void populateAnimalsList() {
        System.out.println("Which animal you want to add ");
        System.out.println("1.Cat ");
        System.out.println("2.Dog ");
        System.out.println("3.Hamster ");
        int animalChoise = scanner.nextInt();
        if (animalChoise == 1) {
            addAnimal(1);
        } else if (animalChoise == 2) {
            addAnimal(2);
        } else if (animalChoise == 3) {
            addAnimal(3);
        } else {
            System.out.println("Wrong animal number");
        }
    }

    private static void addAnimal(int animalChoice) {
        Animal animal;
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter age");
        Integer age = scanner.nextInt();
        if (animalChoice == 1) {
            animal = new Cat(name, age);
            animalList.add(animal);
        } else if (animalChoice == 2) {
            animal = new Dog(name, age);
            animalList.add(animal);
        } else if (animalChoice == 3) {
            animal = new Hamster(name, age);
            animalList.add(animal);
        }
    }
}
