package week1.Problems;

public class QuickFindUF {

    private Integer[] id;
    public final int no_of_nodes;

    public QuickFindUF(int n){
        id=new Integer[n]; // initializing array based on number of nodes
        no_of_nodes=n;
        for(int i=0;i<n;i++){
            id[i]=i; // adding node ids
        }
    }

    public boolean isConnected(int node1, int node2){
        return id[node1]==id[node2];
    }

    public void union(int node1, int node2){

        int node1_id=id[node1];
        int node2_id=id[node2];

        for (int i=0;i<no_of_nodes;i++){
            if(id[i]==node1_id)
                id[i]=node2_id;
        }

    }

}
