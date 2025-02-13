package main;

import models.Cat;
import models.Dog;
import shelter.AnimalShelter;

public class Main {

    public static void main(String[] args) {

        // Instantiate the animal shelter
        AnimalShelter shelter = new AnimalShelter();

        // Add animals to the shelter using enqueue
        shelter.enqueue(new Dog("Spot"));
        shelter.enqueue(new Dog("Winnie"));
        shelter.enqueue(new Cat("Bob"));
        shelter.enqueue(new Dog("Buddy"));
        shelter.enqueue(new Cat("Fluffy"));

        // Display the number of animals at the shelter
        shelter.displayAnimals();

        // Adopt animals from shelter using dequeue
        System.out.println("Adopting oldest animal: " + shelter.dequeueAny());
        System.out.println("Adopting oldest dog: " + shelter.dequeueDog());
        System.out.println("Adopting oldest cat: " + shelter.dequeueCat());

        // Display the number of animals remaining at the shelter after adopting
        shelter.displayAnimals();

    }
}
