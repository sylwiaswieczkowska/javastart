package pl.sda.javastart.day12;

import java.util.Objects;
import java.util.Random;

public class HashCodeRandom {
    private String firstName;
    private String secondName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private Random random = new Random();
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeRandom that = (HashCodeRandom) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(secondName, that.secondName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(random, that.random);
    }
    @Override
    public int hashCode() {//za kazdym razem kiedy wywołujesz metode jest inny random,
        return random.nextInt();
    }
}
