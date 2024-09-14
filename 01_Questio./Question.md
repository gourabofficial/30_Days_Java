# why String are  immutable in java?

* its value can't be changed otherwise any hacker could change the referenced value to cause security issues in the application.
# can we override a static method in java?
* no,static method cant be overriden in java 

# is string thread-safe in java?
yes

# what is Dynamic Method Dispatch in Java ?

Dynamic Method Dispatch in Java is a powerful concept of runtime polymorphism. It refers to the process where a call to an overridden method is resolved at runtime rather than compile-time. This allows Java to support runtime method overriding, enabling flexibility and code reusability.

### Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Reference of superclass (Animal) refers to subclass object (Dog)
        Animal animal = new Dog();
        animal.sound();  // Output: Dog barks

        // Reference of superclass refers to subclass object (Cat)
        animal = new Cat();
        animal.sound();  // Output: Cat meows
    }
}

```
# what is upcasting and downcasting ?

* Upcasting:
Upcasting refers to casting a subclass object to a superclass reference.

* Downcasting: 
Downcasting is the process of casting a superclass reference back to a subclass reference.

