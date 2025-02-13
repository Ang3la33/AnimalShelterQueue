package shelter;

import models.Animal;
import models.Dog;
import models.Cat;
import java.util.PriorityQueue;

public class AnimalShelter {
    private PriorityQueue<Dog> dogQueue = new PriorityQueue<>();
    private PriorityQueue<Cat> catQueue = new PriorityQueue<>();

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogQueue.add((Dog) animal);
        } else if (animal instanceof Cat) {
            catQueue.add((Cat) animal);
        }
    }
}
