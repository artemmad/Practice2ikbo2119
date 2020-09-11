package ru.mirea.humanoid;

import java.util.Arrays;

public class Human {
    private String name = "Олег";
    private Hand[] hands = {new Hand("Левая рука"), new Hand("Правая рука")};
    private Head head = new Head();
    private Leg[] legs = {new Leg("Левая нога"), new Leg("Правая нога")};


    @Override
    public String toString() {
        return "Человек" + "- по имени "+name+ " {" +
                "С руками=" + Arrays.toString(hands) +
                ", головой=" + head +
                ", и ногами=" + Arrays.toString(legs) +
                '}';
    }

    public void print(){
        System.out.println(this);
    }
}
