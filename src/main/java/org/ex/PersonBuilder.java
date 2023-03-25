package org.ex;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException("Не указано имя");
        } else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {

        if (surname == null) {
            throw new IllegalArgumentException("Не указанa фамилия");
        } else {
            this.surname = surname;

        }
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age <= 0) {
            throw new IllegalArgumentException("Не корректный возраст");
        } else {

            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalArgumentException {
        Person person;
        if (name == null || surname == null) {
            throw new IllegalArgumentException("Имя или Фамилия не указаны");
        } else if (age == 0) {
            person = new Person(name, surname);
        } else {
            person = new Person(name, surname, age);

        }
        person.setAddress(address);

        return person;
    }
}