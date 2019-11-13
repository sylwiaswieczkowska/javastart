package pl.sda.javastart.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Person {
    private String pesel;
    private List<Food> availabelFood = new ArrayList<>();
    private List<Animal> animal= new ArrayList<>();


    public void feed(){
        for (Animal animal1: animal) {
            availabelFood.stream()
                    .filter(animal1::isMyFavourite)
                    .findAny()//optional
                    .ifPresent(animal1::feedAnimal);//tu pracujemy na optionalu nie na steamie
        }
    }
    public List<Animal> listOfHungryAnimals(){
        return animal.stream()
                .filter(Animal::isHungry)
                .collect(Collectors.toList());
    }
    public Person(String pesel, List<Food> availabelFood, List<Animal> animal) {
        this.pesel = pesel;
        this.availabelFood= availabelFood;
        this.animal = animal;
    }

    public List<Food> getAvailabelFood() {
        return availabelFood;
    }

    public void setAvailabelFood(List<Food> availabelFood) {
        this.availabelFood = availabelFood;
    }

    public String getPesel() {
        return pesel;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public List<Animal> getAnimal() {
        return animal;
    }
    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(pesel, person.pesel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("pesel='").append(pesel).append('\'');
        sb.append(", availabelFood=").append(availabelFood);
        sb.append(", animal=").append(animal);
        sb.append("}\n");
        return sb.toString();
    }
}
