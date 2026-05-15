package Recursion;

public class XToThePowerN {
    public static int power (int x, int n){
        if (n == 0){
            return 1;
        }
        return x * power (x, n-1);
    }
    // better approach  
    // this function looks like log n time complexity but actualy it is not
    // it makes call to the powerfunction twise for same work that we divided first in half
    public static int powerFunction (int x, int n){
        if (n % 2 == 0){
            if (n == 0){
                return 1;
            }
            return powerFunction (x, n/2) * powerFunction (x, n/2);
        }
        else {
            return x * powerFunction (x, n/2) * powerFunction (x, n/2);
        }
    }
     // optimize approch 
     // this function actually have log n time complexity
     // because it stores result of half power in veriable and than use this veriable to do the next work
    public static int optimizedPower (int x, int n){
        
        if (n == 0){
            return 1;
        }
        int halfPower = optimizedPower (x, n/2);
        if (n % 2 != 0){
              return x * halfPower * halfPower; 
        } 
       return halfPower * halfPower;
    }
    public static void main(String[] args) {
        System.out.println(power (2, 10));
        System.out.println(powerFunction (2, 10));
        System.out.println(powerFunction (2, 11));
        System.out.println(optimizedPower (2,10));
        System.out.println(optimizedPower (2,11));
    }
    
}
