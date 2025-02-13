package shelter;

import models.Animal;
import models.Dog;
import models.Cat;
import java.util.PriorityQueue;

public class AnimalShelter {
    private PriorityQueue<Dog> dogQueue = new PriorityQueue<>();
    private PriorityQueue<Cat> catQueue = new PriorityQueue<>();

    // Method to add an animal to the shelter
    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogQueue.add((Dog) animal);
        } else if (animal instanceof Cat) {
            catQueue.add((Cat) animal);
        }
    }

    // Method to adopt the oldest animal in shelter
    public Animal dequeueAny() {
        if (dogQueue.isEmpty() && catQueue.isEmpty()) return null;
        if (dogQueue.isEmpty()) return dequeueCat();
        if (catQueue.isEmpty()) return dequeueDog();

        Dog oldestDog = dogQueue.peek();
        Cat oldestCat = catQueue.peek();

        // If the oldest dog arrived before the oldest cat remove and return the oldest dog
        // Else remove and return the oldest cat
        return (oldestDog.getArrivalTime() < oldestCat.getArrivalTime()) ? dogQueue.poll() : catQueue.poll();
    }

    // Method to adopt the dog that has been at the shelter the longest
    public Dog dequeueDog() {
        return dogQueue.poll();
    }

    // Method to adopt the cat that has been at the shelter the longest
    public Cat dequeueCat() {
        return catQueue.poll();
    }
}
