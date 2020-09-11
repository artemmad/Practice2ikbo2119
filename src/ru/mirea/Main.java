package ru.mirea;

import ru.mirea.humanoid.Human;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Practrice 3.1
        Circle circle = new Circle(10,15,15);
        circle.print();
        System.out.println(circle.getCircleSpace());

        System.out.println();


        //practice 3.2
        Human human = new Human();
        human.print();
    }
}
