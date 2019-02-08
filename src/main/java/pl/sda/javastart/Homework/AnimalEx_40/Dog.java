package pl.sda.javastart.Homework.AnimalEx_40;

public class Dog extends Pet {
    public Dog(String name, Double weight, Integer age, Human owner) {
        super(name, weight, age, owner);
    }
    void biteBone(){
        System.out.println("Gryzę kość.");
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself()+ "Jestem psem.";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
