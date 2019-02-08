package pl.sda.javastart.Homework.AnimalEx_40;

public class Bird extends Pet {
    public Bird(String name, Double weight, Integer age, Human owner) {
        super(name, weight, age, owner);
    }
    void singWhenFlying(){
        System.out.println("Śpiewam podczs latania.");
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself() + "Jestem ptakiem.";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
