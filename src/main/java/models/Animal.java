package models;

public abstract class Animal implements Comparable<Animal>{
    private int counter = 0;
    private int arrivalTime;
    private String name;

    public Animal(String name) {
        this.name = name;
        this.arrivalTime = counter++;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.arrivalTime, other.arrivalTime);
    }


}


