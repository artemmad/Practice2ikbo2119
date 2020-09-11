package ru.mirea.humanoid;

public class Hand {
    public String handOrientation;

    public Hand(String handOrientation) {
        this.handOrientation = handOrientation;
    }

    @Override
    public String toString() {
        return "Рука{" +
                "тип руки='" + handOrientation + '\'' +
                '}';
    }
}
