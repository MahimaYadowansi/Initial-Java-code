package initial_code;
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of the parent class
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}


public class InheritanceExample {

	public static void main(String[] args) {
		 // Create an instance of the parent class
        Animal myAnimal = new Animal("Generic Animal", 5);
        myAnimal.eat();
        myAnimal.sleep();

        // Create an instance of the child class
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        myDog.eat();   // Inherited from the parent class
        myDog.sleep(); // Inherited from the parent class
        myDog.bark();  // Specific to the Dog class
	}

}
