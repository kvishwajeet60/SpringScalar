package com.scalar.SampleDemo;
public class Person {
    String name;
    int age;
    String message;


    public Person(String name, int age, String message) {
        this.name = name;
        this.age = age;
        this.message = message;
    }

    //setters and getters converts OBJECT to JSON
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
