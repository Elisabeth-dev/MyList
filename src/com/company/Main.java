package com.company;

import com.company.homework1.MyList;
import com.company.homework1.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyList<Person> liza = new MyList<>();
        Person people = new Person("Liza", 22);
        Person people1 = new Person("Liza", 12);
        Person people2 = new Person("Liza", 12);
        Person people3  = new Person("Liza", 24);
        Person people4 = new Person("Liza", 35);
        Person people5 = new Person("Liza", 12);
        liza.add(people);
        liza.add(people1);
        liza.add(people2);
        liza.add(people3);
        liza.add(people4);
        liza.add(people5);
        for (int i = 0; i < liza.size(); i++){
            System.out.println(liza.get(i).toString());

        }

        liza.shuffle();
        for (int i = 0; i < liza.size(); i++){
            System.out.println(liza.get(i).toString());

        }
        liza.sort(Person::compareTo);
        System.out.println("-----------------------------------");


        for (int i = 0; i < liza.size(); i++){
            System.out.println(liza.get(i).toString());

        }


//
//        liza.add(22);
//        liza.add(11);
//        liza.add(11);
//        liza.add(11);
//        liza.add(100);
//        liza.add(121);
//        liza.shuffle();
//
//        System.out.println(liza.toString());
//        liza.sort()


    }
}
