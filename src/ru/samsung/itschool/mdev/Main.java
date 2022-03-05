package ru.samsung.itschool.mdev;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {



                int[] a = {456,4,3,3,3,4,236657,8,88};
      //  Arrays.sort(); // quick sort

        String[] str = {"345","345","dfgs","sdfsdf"};
      //  Arrays.sort(); // merge sort

        Person[] persons = new Person[3];
        persons[0] = new Person("Ivan",15);
        persons[1] = new Person("Petr",14);
        persons[2] = new Person("Olga",16);

        /*Comparator<Person> rule = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age-o2.age;
            }
        };*/

        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

    }
}

class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // Некий класс, состоящий из двух полей
    // строковое
    // числовое
    // Сортируем по числовому полю, а если они равны, то сортируем по строке
    
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
        //return this.age-o.age;
    }
}
