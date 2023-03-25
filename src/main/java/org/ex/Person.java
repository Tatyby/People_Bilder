package org.ex;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setAddress(address).setSurname(surname);

    }

    public boolean hasAge() {
        if (getAge().isEmpty()) {
            return false;

        } else {
            return true;
        }
    }

    public boolean hasAddress() {
        if (getAddress().isEmpty()) {
            return false;

        } else {
            return true;
        }

    }

    public String getName() {
        return name;

    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {

        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public void happyBirthday() {
        this.age = this.age + 1;
    }


    @Override
    public String toString() {
        return "Человека: " +
                "имя='" + name + '\'' +
                ", фамилия='" + surname + '\'' +
                ", возраст=" + age +
                ", адрес='" + address + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

}



