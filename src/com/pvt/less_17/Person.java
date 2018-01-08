package com.pvt.less_17;

/**
 * Created by W510 on 08.01.2018.
 */
public class Person {
    String firstName;
    String SecondName;
    Integer age;

    public Person(String firstName, String secondName, Integer age) {
        this.firstName = firstName;
        SecondName = secondName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getSecondName();
    }
}
