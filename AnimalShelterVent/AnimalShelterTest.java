package AnimalShelterVent;

import java.util.Scanner;

public class AnimalShelterTest {
    private AnimalShelter shelter;
    private Scanner scanner;

    public AnimalShelterTest() {
        shelter = new AnimalShelter();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Animal Shelter CLI!");
        String command;

        while (true) {
            System.out.println("\n---------- Animal Shelter Management ----------");
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Enqueue Animal");
            System.out.println("2. Dequeue Any Animal");
            System.out.println("3. Exit");
            System.out.println("\n-----------------------------------------------");
            System.out.print("\nEnter your choice: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    enqueueAnimal();
                    break;
                case "2":
                    dequeueAnyAnimal();
                    break;
                case "3":
                    System.out.println("\n-----------------------------------------------");
                    System.out.println("\nThank you for using the Animal Shelter CLI. Goodbye!");
                    return;
                default:
                    System.out.println("\n-----------------------------------------------");
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    private void enqueueAnimal() {
        System.out.println("\n------------- Enqueue Cat or Dog --------------");
        System.out.print("\nEnter animal type (dog/cat): ");
        String type = scanner.nextLine().toLowerCase();

        if (!type.equals("dog") && !type.equals("cat")) {
            System.out.println("\n-----------------------------------------------");
            System.out.println("\nInvalid animal type. Only 'dog' or 'cat' are allowed.");
            return;
        }

        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();

        shelter.enqueue(type, name);
        System.out.println("\n-----------------------------------------------");
        System.out.println("\nEnqueued " + type + " named " + name + ".");
    }

    private void dequeueAnyAnimal() {
        AnimalShelter.Animal animal = shelter.dequeueAny();
        if (animal != null) {
            System.out.println("\n------------- Dequeue Cat or Dog --------------");
            System.out
                    .println("\nDequeued the oldest animal: " + animal.getType() + " named " + animal.getName() + ".");
        } else {
            System.out.println("\n-----------------------------------------------");
            System.out.println("\nNo animals available for adoption.");
        }
    }

    public static void main(String[] args) {
        AnimalShelterTest cli = new AnimalShelterTest();
        cli.start();
    }
}