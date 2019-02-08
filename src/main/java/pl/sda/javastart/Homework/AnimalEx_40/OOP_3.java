package pl.sda.javastart.Homework.AnimalEx_40;

import pl.sda.javastart.day4.Car;

import java.util.ArrayList;
import java.util.List;

public class OOP_3 {
    public static void main(String[] args) {

        animalsToString();
        animalsIntrodouceYourself();
        animalsCharacteristic();
        ownerName();
    }
    private static void ownerName() {
        System.out.println("Metoda z implementacją ownerHolder");
        OwnerHolder car = new Car("Fabia","Skoda",5,new Human("Maria", 63.6, 63));
        OwnerHolder dog = new Dog("Fąfel", 13.8, 5, new Human("Marcin", 87.4, 35));
        List<OwnerHolder> ownerHolders = new ArrayList<>();
        ownerHolders.add(dog);
        ownerHolders.add(car);
        for (OwnerHolder owner : ownerHolders) {
            System.out.println(owner.getOwnerName());
        }
    }
    private static void animalsCharacteristic() {
        System.out.println("Metoda z charkterystycznym zachowaniem");
        List<Animal> animalList = animalsList();
        for (Animal animal : animalList) {
            System.out.println(animal.introduceYourself());
            if (animal instanceof Dog) {
                ((Dog) animal).biteBone();
            }
             else if (animal instanceof Cat) {
                ((Cat) animal).drinkMilk();
            }
            else if (animal instanceof Bird) {
                ((Bird) animal).singWhenFlying();
            } else {
                ((Human) animal).cogitoErgoSum();
            }
        }
    }
    private static void animalsIntrodouceYourself() {
        System.out.println("Metoda z przedstawianiem ");
        List<Animal> animalList = animalsList();
        for (Animal animal : animalList) {
            System.out.println(animal.introduceYourself());
        }
    }
    private static List<Animal> animalsList() {
        Animal dog = new Dog("Fąfel", 13.8, 5, new Human("Marcin", 87.4, 35));
        Animal cat = new Cat("Puszek", 8.7, 5, new Human("Emilia", 49.0, 34));
        Animal bird = new Bird("Tutu", 0.9, 2, new Human("Paulina", 60.5, 35));
        Animal human = new Human("Maria", 63.6, 63);
        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(cat);
        animalList.add(bird);
        animalList.add(human);
        return animalList;
    }
    private static void animalsToString() {
        System.out.println("Metoda toString");
        Dog dog = new Dog("Fąfel", 13.8, 5, new Human("Marcin", 87.4, 35));
        Cat cat = new Cat("Puszek", 8.7, 5, new Human("Emilia", 49.0, 34));
        Bird bird = new Bird("Tutu", 0.9, 2, new Human("Paulina", 60.5, 35));
        Human human = new Human("Maria", 63.6, 63);
        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(bird.toString());
        System.out.println(human.toString());
    }
}
