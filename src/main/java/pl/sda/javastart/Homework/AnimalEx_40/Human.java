package pl.sda.javastart.Homework.AnimalEx_40;

public class Human extends Mammal {
    public Human(String name, Double weight, Integer age) {
        super(name, weight, age);
    }
    void cogitoErgoSum(){
        System.out.println("Jestem, bo myślę.");
    }
    @Override
    public String introduceYourself() {
        return super.introduceYourself() + "Jestem człowiekiem.";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
