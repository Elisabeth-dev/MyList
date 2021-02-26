package com.company.homework1;

public class Person implements Comparable<Person> {
    String liza;
    int age;

    public Person(String liza, int age) {
        this.liza = liza;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return person.age >= age ? -1 : 1 ;
    }

    @Override
    public String toString() {
        return "Person{" +
                "liza='" + liza + '\'' +
                ", age=" + age +
                '}';
    }
}
