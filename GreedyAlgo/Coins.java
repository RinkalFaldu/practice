package GreedyAlgo;
import java.util.*;
// we are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 2000]
// Find min no. of conins/ notes to make change for a value.

public class Coins {
    public static void main(String[] args) {
        Integer coins [] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        Arrays.sort(coins, Comparator.reverseOrder());

        int countofCoins =0;
        int amount  = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i= 0; i< coins.length; i++){
            if (coins[i] <= amount ){
                while (coins[i] <= amount){
                    countofCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("total min coins used =" + countofCoins);
        for (int i =0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
    
}
