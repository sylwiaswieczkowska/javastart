package pl.sda.javastart.day15;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements IntroduceYourSelf{

    private String name;
    private Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String itroduceYourSelf() {
        return getClass() + ": " + "name " + name + "; " + "age " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
  }
