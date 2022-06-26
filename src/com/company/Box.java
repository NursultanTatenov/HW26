package com.company;

public class Box <T> {
    T weight;

    public Box() {
    }

    public Box(T weight) {
        this.weight = weight;
    }

    public static <T>Box<T> genericMethod (T arg){
        return new Box<> (arg);
    }

    @Override
    public String toString() {
        return "Box{" + "weight= " + weight + " kg }";
    }
}
