package week2.problems.sort;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Shuffling {
    public static void main(String[] args) {
        int[] cards=new int[]{9,1,2,8,4,3,5,6,10,7};
        for(int i=0;i<cards.length;i++){ // O(n)
            int rand=StdRandom.uniformInt(i+1);
            int swap=cards[i];
            cards[i]=cards[rand];
            cards[rand]=swap;
        }
        System.out.println(Arrays.toString(cards));
    }
}
