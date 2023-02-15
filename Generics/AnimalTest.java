package Generics;

import java.util.List;

public class AnimalTest {
  public static void takeAnimals(List<? extends Animal> animals) {
    // Now the method accepts any type that is extending Animal, making it available
    // to accept Dog or Cat
    for (Animal animal : animals) {
      animal.eat();
    }
  }

  public <T extends Animal> List<T> takeAnimals2(List<T> list) {
    // Now we first have to define T and say "<T extends Animal>" and then indicate
    // the return type of the method
    // we can return the List of the generic type T
    List<T> takenList = List.of();
    for (T animal : list) {
      takenList.add(animal);
      animal.eat();
    }
    return takenList;
  }

  public static void main(String[] args) {
    List<Dog> dogs = List.of(new Dog(), new Dog());
    List<Animal> animals = List.of(new Dog(), new Dog(), new Cat());
    takeAnimals(dogs);
    takeAnimals(animals);
  }
}