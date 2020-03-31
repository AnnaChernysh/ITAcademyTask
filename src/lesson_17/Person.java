package lesson_17;
/*
Дан класс Person с полями firstName,lastName,age.
Вывести полное имя самого старшего человека,у которого длина этого имени не превышает 15символов.
*/

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person() {
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public String toString() {
        return "[" + firstName + " " + lastName +
                " " + age + " ]";
    }


    public static void main(String[] args) {

        List<Person> listPersons = new ArrayList<>();

        listPersons.add(new Person("Jack", "Millan", 35));
        listPersons.add(new Person("Bob", "Swolly", 67));
        listPersons.add(new Person("Alice", "Marvel", 72));
        listPersons.add(new Person("Dilan", "Kalki", 39));
        listPersons.add(new Person("Dilanxvvbsdjbskdvsdvsfg", "adfjahbsjfahsvfjahv", 93));


        List<String> fullNames = listPersons.stream()
                .map(p -> p.firstName() + ' ' + p.lastName())
                .collect(Collectors.toList());
        Person oldestPerson = listPersons.stream()
                .filter(h -> h.firstName().length() < 15 && h.firstName().length() < 15)
                .reduce(BinaryOperator.maxBy(Comparator.comparing(Person::getAge)))
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(oldestPerson);
    }
}
