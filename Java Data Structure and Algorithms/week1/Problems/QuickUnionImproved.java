package week1.Problems;

public class QuickUnionImproved {

    private Integer[] id;
    private Integer[] sz;

    public QuickUnionImproved(int n){
        id=new Integer[n];
        sz=new Integer[n];
        for(int i=0;i<n;i++){
            id[i]=i; // adding node ids
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
    }
}
