public class sumdigit {
    public static int sumofNumber (int number) {
        int sum =0;
        while (number > 0){
            int lastdigit = number % 10;
            sum = sum + lastdigit;
            number = number /10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of number is " +  sumofNumber(333));
        
    }
}
