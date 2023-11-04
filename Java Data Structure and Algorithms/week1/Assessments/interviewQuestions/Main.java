package week1.Assessments.interviewQuestions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UnionFind uf=new UnionFind(10);
        //int[][] connections=new int[][]{{0,1},{2,1},{7,1},{5,0},{6,5},{3,8},{4,3},{9,8},{8,1}}; // large tree
        //int[][] connections=new int[][]{{1,2},{1,6},{2,9}}; // small tree
        int[][] connections=new int[][]{{1,2},{1,6},{2,9},{3,4},{3,5},{7,5},{3,8},{5,8}}; // two trees
        for (int[] connection : connections) {
            if(!uf.isConnected(connection[0],connection[1])){
                uf.union(connection[0],connection[1]);
            }
        }
        System.out.println(Arrays.toString(uf.getId()));
        System.out.println(uf.findMaxInRoot(6));
        System.out.println(uf.successorDelete(8));
    }
}
