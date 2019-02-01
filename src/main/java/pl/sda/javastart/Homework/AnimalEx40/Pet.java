package pl.sda.javastart.Homework.AnimalEx40;

public class Pet extends Animal implements OwnerHolder {
    private Human owner;

    public Pet(String name, Double weight, Integer age, Human owner) {
        super(name, weight, age);
        this.owner = owner;
    }

    @Override
    public String getOwnerName() {
        return "Imię właściciela: " + owner.getName();
    }

    @Override
    public String introduceYourself() {
        return "Jestem zwierzęciem. ";
    }

    @Override
    public String toString() {
        return super.toString()+ "Moim właścicielem jest: " + this.owner.toString();
    }
}
