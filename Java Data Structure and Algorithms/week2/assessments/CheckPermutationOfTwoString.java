package week2.assessments;

/* check whether two string has same number of permutation, i.e.  to check if both the string has same characters in them
* so, they will have same permutation*/
public class CheckPermutationOfTwoString {
    public static void main(String[] args) {
        final int NO_OF_CHAR=256;
        int counter[]=new int[NO_OF_CHAR];
        String str1="ABCFEDX";
        String str2="FEABCDY";
        char[] str1_arr=str1.toCharArray();
        char[] str2_arr=str2.toCharArray();
        for(int i=0;i<str1_arr.length;i++){
            counter[str1_arr[i]]++;
            counter[str2_arr[i]]--;
        }
        boolean isSame=true;
        for(int j=0;j<counter.length;j++)
        {
            if(counter[j]!=0){
                isSame=false;
                break;
            }
        }
        System.out.println(isSame);
    }
}
