
public class AbstracClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);  // here it prints color of parent class because it whenever we call child class first it make call to constructor of parent class 

        Chicken c = new Chicken();
        c.eat();
        c.walk(); 

       Mustang m = new Mustang(); 
    }  
}
// abstract class
// we can not create object of abstract class
// but we can create constructor inside abstract class
abstract class Animal {
    String color;
    Animal(){
          System.out.println("animal constructor called");
    }

    void eat(){
       System.out.println("animal eats"); 
    }

    abstract void walk (); // abstract method does not have implementation. implementation of abstract method define in sub class
    // abstraction just gives an idea not implementation detail
}

class Horse extends Animal{
    Horse (){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
          color = "dark brown";
    }
        void walk(){      // it is mendetory to define abstract method here in sub class
            System.out.println("walks on 4 legs");
        }
}

class Mustang extends Horse{
    Mustang(){
      System.out.println("Mustang constructor called");  
    }
}
     
class Chicken extends Animal {
    void changeColor(){
        color = "yellow";
        
    }
        void walk(){
            System.out.println("walk on 2 legs");
        }
}

    
