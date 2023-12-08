package org.example;

import java.util.Objects;

public class Grad {
    int salary ;
    int yop ;
    int id ;
    String name ;

    Grad(String name ,int id ,int salary , int yop){
        this.salary= salary ;
        this.yop= yop ;
        this.id = id ;
        this.name = name ;
    }
    public int getSalary() {

        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grad grad = (Grad) o;
        return salary == grad.salary && yop == grad.yop && id == grad.id && Objects.equals(name, grad.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, yop, id, name);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYop() {
        return yop;
    }

    public void setYop(int yop) {
        this.yop = yop;
    }

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

}
/*
create ds Arraylist whenever next element is inserted then it will cut down half elements and size will be double:wq
create Binary Hashmap based on 0 or 1 it will have 2 buckets */