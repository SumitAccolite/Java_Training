package org.example;

import java.util.Objects;

class Student<T> {
    T obj ;//generic Object created
//    Student(T obj){
//        this.obj = obj ;
//    }
    //return the value of generic Object

    public T getObj(){
        return this.obj ;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}
