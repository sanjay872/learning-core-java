package week1.Problems;

public class QuickUnionUF {

    private Integer[] id;

    public QuickUnionUF(int n){
        id=new Integer[n];
        for(int i=0;i<n;i++){
            id[i]=i;
        }
    }

    private int root(int node){
        while(id[node]!=node) node=id[node];
        return node;
    }

    public boolean isConnected(int node1, int node2){
        return root(node1) == root(node2);
    }

    public void union(int node1, int node2){
        int node1_root=root(node1);
        int node2_root=root(node2);
        id[node2_root]=node1_root;
    }

    public boolean ifNotConnectedDoUnion(int node1, int node2){
        int node1_root=root(node1);
        int node2_root=root(node2);
        if(node1_root==node2_root)
            return false;
        id[node2_root]=node1_root;
        return true;
    }

}
