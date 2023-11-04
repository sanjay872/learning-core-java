package week1.Assessments.interviewQuestions;

import java.util.Arrays;

public class UnionFind {
    private Integer[] id;
    private Integer[] sz;

    public UnionFind(int n){
        id=new Integer[n];
        sz=new Integer[n];
        for(int i=0;i<n;i++){
            id[i]=i; // adding node ids
            sz[i]=1;
        }
    }

    public boolean isConnected(int node1, int node2){
        return root(node1) == root(node2);
    }

    private int root(int node){
        while(node!=id[node]) {
            id[node]=id[id[node]]; // path compression
            node=id[node];
        };
        return node;
    }

    public void union(int node1, int node2){
        int node1_root=root(node1);
        int node2_root=root(node2);
        if(node1_root == node2_root){
            return;
        }
        if (sz[node1_root] < sz[node2_root]){ // tracking the tree size and connecting smaller tree to bigger once.
            id[node1_root]=node2_root;
            sz[node2_root]+=sz[node1_root];
        }
        else{
            id[node2_root]=node1_root;
            sz[node1_root]+=sz[node2_root];
        }
        System.out.println(Arrays.toString(id));
    }

    public Integer[] getId() {
        return id;
    }

    public int findMaxInRoot(int node){
        int root_of_node=root(node);
        int largest_element=Integer.MIN_VALUE;
        for(int i=0;i<id.length;i++){
            if(i>largest_element){
                if(id[i]==root_of_node || root(id[i])==root_of_node){
                    largest_element=i;
                }
            }
        }
        return largest_element;
    }
    public int successorDelete(int currentHead){
        int root_of_node=root(currentHead);
        int successor=Integer.MIN_VALUE;
        for(int i=0;i<id.length;i++){
            if(i!=currentHead&&i>successor){
                if(id[i]==root_of_node || root(id[i])==root_of_node){
                    successor=i;
                }
            }
        }
        return successor;
    }
}
