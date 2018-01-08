package com.pvt.less_17;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by W510 on 08.01.2018.
 * 5.	Дан класс Person с полями firstName, lastName, age.
 Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.

 */
public class Cl_05 {
    public static void main(String[] args) {
        Person p1 = new Person("valera1", "sokolov", 10);
        Person p2 = new Person("valera2", "sokolov", 17);
        Person p3 = new Person("valera3", "sokolov", 20);
        Person p4 = new Person("valera4", "sokolov", 23);
        Person p5 = new Person("valera5VeryLongName", "sokolov", 30);

        List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5);

//        String result = personList.stream()
        Optional<Person> result = personList.stream()
                .filter(person -> person.getFirstName().length() < 15)
                .sorted((o1, o2) -> -o1.getAge().compareTo(o2.getAge()))
                .findFirst();

        System.out.println(result.get().toString());
    }

}
