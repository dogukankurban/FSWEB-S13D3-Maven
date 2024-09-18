package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double boy;
    int kilo;
    String cinsiyet;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double boy, int kilo, String cinsiyet) {
        this(firstName,lastName,age);
        this.boy = boy;
        this.kilo = kilo;
        this.cinsiyet = cinsiyet;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        return this.age>=13 && this.age <=19;
    }
}
