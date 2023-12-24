package week4.assessment;
/*
* A taxicab number is an integer that can be expressed as the sum of two cubes of positive integers in two different ways:
* a+b =c +d. For example, 1729. 1729 is the smallest taxicab number:
* 9^3+10^3 =1^3+12^3.
* Design an algorithm to find all  taxicab numbers with a,b,c, and less than n.
* */
public class TaxiCabNumber {

    public void find(int n){
        int count=0;
        int i=1;
        while(count<n){
            int init_count=0;
            for(int j=1;j<=Math.pow(i,1.0/3);j++){
                for(int k=j+1;k<=Math.pow(i,1.0/3);k++){
                    if(((j*j*j)+(k*k*k))==i){
                        init_count++;
                    }
                }
            }
            if(init_count==2){
                count++;
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        TaxiCabNumber tx=new TaxiCabNumber();
        tx.find(2);
    }
}
