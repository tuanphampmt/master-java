package collections.List_Interface;

import collections.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class vd_Sort_3 {

    public static void main(String[] args) {
        //Option 1: Collections.sort() with Comparable
        Person person1 =  new Person(1, "tuan@123");
        Person person2 =  new Person(2, "nguyen@123");
        Person person3 =  new Person(3, "long@123");
        Person person4 =  new Person(4, "minhh@123");
        Person person5 =  new Person(5, "huyen@123");
        Person person6 =  new Person(6, "Anhn@123");

        List<Person> list = new ArrayList<>();
        list.add(person4);
        list.add(person6);
        list.add(person1);
        list.add(person3);
        list.add(person2);
        list.add(person5);

        //sort tăng dần
        List<Person> sortPerson1 = list.stream()
                .sorted(Comparator.comparing(Person::getEmail))
                .collect(Collectors.toList());
        System.out.println("List sau khi sort tăng dần: ");
        for (Person item : sortPerson1) {
            System.out.println(item);
        }

        // sort giảm dần
        List<Person> sortPerson2 = list.stream()
                .sorted(Comparator.comparing(Person::getEmail).reversed()).collect(Collectors.toList());
        System.out.println("List sau khi sort giảm dần: ");
        for (Person item : sortPerson2) {
            System.out.println(item);
        }
    }
}
