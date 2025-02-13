# Animal Shelter Queue

## A First-In, First-Out (FIFO) Animal Adoption System

This **Java-based** application implements an **animal shelter queue system**, where users can adopt:
1. The **oldest animal**
2. The **oldest dog or cat**

## Features
- Implements a **FIFO** Adoption System
- Uses **PriorityQueue** to track animals
- Allows:
  - `enqueue(Animal animal)` -> Adds an animal
  - `dequeueAny()` -> Adopts the oldest animal
  - `dequeueDog()` -> Adopts the oldest dog
  - `dequeueCat()` -> Adopts the oldest cat

