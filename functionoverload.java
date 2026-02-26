//function overloading : type 1. interms of parameters : in this case fucntion can have different number of parameters with same types of data type with same function name 
//                       type 2. interms of data types : in this case function same number of parameters with different data types  with same function name

public class functionoverload {
     //example of function overloading interms of parameters
    public static int sum (int a, int b){
        return a + b;
    }
    
    public static int sum (int a, int b, int c){
        return a + b + c;
    } 

    //example of function overloading interms of data types
    public static int add(int a, int b){
        return a + b;
    }
    
    public static float add(float a, float b){
        return a + b;
    }
    

    
    public static void main(String[] args) {
        System.out.println(sum ( 5, 3));
        System.out.println(sum (3, 5, 8));

       System.out.println(add (3, 5));
       System.out.println(add (3.2f, 4.8f));

    }
    
}
