package Udemy.Queue.AnimalShelter;

public class Main {
    public static void main(String[] args) {
        AnimalQueue animals= new AnimalQueue();
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Cat("Snow"));
        animals.enqueue(new Dog("Sheru"));
        animals.enqueue(new Dog("Cheems"));
        animals.enqueue(new Cat("Meow"));
        animals.enqueue(new Dog("Pit"));

        System.out.println(animals.dequeueAny().name());
        System.out.println(animals.peekAny().name());
        System.out.println(animals.peekCats().name());
        System.out.println(animals.peekDogs().name());
        System.out.println(animals.dequeueCats().name());
        System.out.println(animals.dequeueDogs().name());
    }
}
