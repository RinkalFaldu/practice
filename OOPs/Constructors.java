public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student ();
        Student s2 = new Student ("Rinkal");
        Student s3 = new Student(123);
        
    }
    
}

class Student {
    String name;
    int roll;
    String password;
    // constructor
    // Non-parameterized
    Student (){
        System.out.println("Constructor is called----");
    }
    //parameterized
    Student (String name){
        this.name = name;

    }

    Student (int roll){
        this.roll = roll;
    }

}