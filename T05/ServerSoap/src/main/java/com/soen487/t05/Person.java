package com.soen487.t05;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
    }
    public Person() { }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}



