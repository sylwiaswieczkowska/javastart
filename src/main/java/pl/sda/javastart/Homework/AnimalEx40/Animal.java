package pl.sda.javastart.Homework.AnimalEx40;

public  abstract class Animal {
    private String name;
    private Double weight;
    private Integer age;

    public Animal(String name, Double weight, Integer age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public abstract String introduceYourself();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Imię: ").append(name);
        sb.append(", waga: ").append(weight);
        sb.append(", wiek: ").append(age);
        sb.append(", ");
        return sb.toString();
    }
}
