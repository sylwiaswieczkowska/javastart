package pl.sda.javastart.Homework.AnimalEx40;

public class Mammal extends Animal {

    public Mammal(String name, Double weight, Integer age) {
        super(name, weight, age);
    }
    @Override
    public String introduceYourself() {
        return "Jestem ssakiem. ";
    }
}
