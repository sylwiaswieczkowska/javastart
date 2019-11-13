package pl.sda.javastart.day12;

import java.util.Objects;
import java.util.Random;

public class EqulasRandom {;
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
    public int hashCode() {
        return Objects.hash(firstName, secondName, lastName, random);
    }
    @Override
    public boolean equals(Object obj) {
        return random.nextBoolean();
    }
}
