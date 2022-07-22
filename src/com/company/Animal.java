package com.company;

public abstract class Animal {
    private String nickName;
    private double weight;
    private int age;
    private char gender;

    public Animal(String nickName, double weight, int age, char gender) {
        this.nickName = nickName;
        this.weight = weight;
        this.age = age;
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        }
    }

    @Override
    public String toString() {
        return "Animal's nick name is " + nickName +
                " weight = " + weight + ", " +
                " age = " + age + ", " +
                " gender = " + gender;
    }
}
