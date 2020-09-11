package ru.mirea.humanoid;

public class Leg {
    private String legOrientation;

    public Leg(String legOrientation) {
        this.legOrientation = legOrientation;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "legOrientation='" + legOrientation + '\'' +
                '}';
    }
}
