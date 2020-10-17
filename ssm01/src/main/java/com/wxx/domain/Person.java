package com.wxx.domain;

public class Person {
    private Integer id;
    private String name;
    private Double money;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Person() {
    }

    public Person(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public Person setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Double getMoney() {
        return money;
    }

    public Person setMoney(Double money) {
        this.money = money;
        return this;
    }
}
