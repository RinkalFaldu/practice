package BitManupulation;

public class numberIsPowerTwoOrNot {
    public static boolean NumberPowerTwoOrNot (int n) {
        if ((n & (n -1)) == 0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(NumberPowerTwoOrNot(8));
        
    }
}
