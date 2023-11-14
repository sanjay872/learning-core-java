package week2.assessments;

import java.util.Arrays;

/*
Given an array of n buckets, each containing a red, white, or blue pebble, sort them by color. The allowed operations are:

swap(i,j):  swap the pebble in bucket i with the pebble in bucket j.
color(i): determine the color of the pebble in bucket

The performance requirements are as follows:
1. At most n calls to color().
2. At most n calls to swap().
3. Constant extra space.
* */
public class DutchNationalFlagProblem {
    public static void main(String[] args) {
        String[] data=new String[]{"BLUE","WHITE","WHITE","BLUE","RED","BLUE","WHITE","RED","WHITE"};
        int low=0, mid=0, high=data.length-1;
        while(mid<=high){
            int code=color(data[mid]);
            if(code==0){
                swap(data,low,mid);
                low++;
                mid++;
            }
            else if(code==1){
                mid++;
            }
            else if(code==2) {
                swap(data, high, mid);
                high--;
            }
        }
        System.out.println(Arrays.toString(data));;
    }

    private static void swap(String[] a, int i, int j){
        String swap=a[i];
        a[i]=a[j];
        a[j]=swap;
    }

    private static int color(String color){
        if(color.equals("RED")){
            return 0;
        }
        if(color.equals("WHITE")){
            return 1;
        }
        return 2;
    }
}
