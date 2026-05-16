// Friends Pairing Problem
// given n friends, each one can remain single or can be paired up with some other
// friends. Each friend can be paired only once. find out the total number of ways in which friends can remain single or can be paired up
// example 
// 3 friends = a b c 
// 1st way = a b c      all stays single
// 2nd way = (a, b), c
// 3rd way = (a, c), b
// 4th way = (c, b), a
package Recursion;

public class FriendsPairingProblem {
    public static int Pairing (int n){
        if (n == 1 || n == 2){
            return n;
        }
        int Single = Pairing(n-1);
        int PairedUp = Pairing (n-2);
        int WaysofPair = (n-1) * PairedUp;
        int totalWays = Single + WaysofPair;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(Pairing(4));
    }
    
}
