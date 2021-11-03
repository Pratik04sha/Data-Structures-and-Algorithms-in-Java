package Udemy.Queue.AnimalShelter;
import java.util.LinkedList;
public class AnimalQueue {
    LinkedList<Dog> dogs= new LinkedList<>();
    LinkedList<Cat> cats= new LinkedList<>();
    private int order=0;

    public void enqueue(Animal a){
        a.setOrder(order);
        order++;
        if (a instanceof Dog){
            dogs.addLast((Dog) a);
        }
        else if (a instanceof Cat){
            cats.addLast((Cat) a);
        }
    }
    public int size(){
        return dogs.size()+ cats.size();
    }

    public Dog dequeueDogs(){
        return dogs.poll();
    }

    public Dog peekDogs(){
        return dogs.peek();
    }

    public Cat dequeueCats(){
        return cats.poll();
    }

    public Cat peekCats(){
        return cats.peek();
    }

    public Animal dequeueAny(){
        if (dogs.size()==0){
            return dequeueCats();
        }
        else if (cats.size()==0){
            return dequeueDogs();
        }
        Dog dog= dogs.peek();
        Cat cat= cats.peek();
        if (dog.isOlderThan(cat)){
            return dogs.poll();
        }
        else {
            return cats.poll();
        }
    }

    public Animal peekAny(){
        if (dogs.size()==0){
            return peekCats();
        }
        else if (cats.size()==0){
            return peekDogs();
        }
        Dog dog= dogs.peek();
        Cat cat= cats.peek();
        if (dog.isOlderThan(cat)){
            return dogs.peek();
        }
        else {
            return cats.peek();
        }
    }

}
