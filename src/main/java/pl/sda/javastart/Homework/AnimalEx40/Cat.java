package pl.sda.javastart.Homework.AnimalEx40;

public class Cat extends Pet {
    public Cat(String name, Double weight, Integer age, Human owner) {
        super(name, weight, age, owner);
    }
    void drinkMilk(){
        System.out.println("Pije mleko.");
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself()+ "Jestem kotem. ";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
