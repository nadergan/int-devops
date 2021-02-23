package com.github.alexaegis.people;

public class Person {

    private Name name;
    private int age;

    public Person(Name name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    private void setName(Name name) {
        this.name = name;
    }

}