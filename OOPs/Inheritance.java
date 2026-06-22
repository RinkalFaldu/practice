public class Inheritance {
    public static void main(String[] args) {
         Fish shark = new Fish();
         shark.eat();

        Dog dobby = new Dog();
            dobby.eat();
            dobby.walk (); 
    }
    
}
// Base class
class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe (){
        System.out.println("breathes");
    }
}
// multi level inheritance
class Mammal extends Animal {
    void walk(){
        System.out.println("Walks");
    }
}
class Dog extends Mammal {
    String breed;
}

// Hierarchial Inheritance
class Fish extends Animal {
    void swim(){
        System.out.println("Swims");
    }
}

class Birds extends Animal {
    void fly(){
        System.out.println("fly");
    }
}


// // derived class
// // single level inheritance
// class Fish extends Animal {
//     int fins;
//     void swim (){
//         System.out.println("Swims");
//     }
// }