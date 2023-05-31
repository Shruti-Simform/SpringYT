package com.spring.constructorInjection;

public class Person {
    private int id;
    private String name;
    private Certificate certi;

    public Person(int id, String name,Certificate certi) {
        this.id = id;
        this.name = name;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", certificate='" + certi + '\'' +
                '}';
    }
}
