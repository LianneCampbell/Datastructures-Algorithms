package AnimalShelterVent;

import java.util.LinkedList;

public class AnimalShelter {
    public static class Animal {
        private String type;
        private String name;
        private int order;

        public Animal(String type, String name, int order) {
            this.type = type;
            this.name = name;
            this.order = order;
        }

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public int getOrder() {
            return order;
        }
    }

    private LinkedList<Animal> dogs;
    private LinkedList<Animal> cats;
    private int order;

    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        order = 0;
    }

    public void enqueue(String type, String name) {
        Animal animal = new Animal(type, name, order++);
        if (type.equalsIgnoreCase("dog")) {
            dogs.add(animal);
        } else if (type.equalsIgnoreCase("cat")) {
            cats.add(animal);
        } else {
            throw new IllegalArgumentException("Animal type must be either 'dog' or 'cat'.");
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            return null;
        } else if (dogs.isEmpty()) {
            return cats.poll();
        } else if (cats.isEmpty()) {
            return dogs.poll();
        } else {
            return (dogs.peek().getOrder() < cats.peek().getOrder()) ? dogs.poll() : cats.poll();
        }
    }
}