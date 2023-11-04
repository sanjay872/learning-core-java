package week1.Assessments.PercolationProblem;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation{

    private boolean[][] grid; //Percolation grid
    private final int n;
    private WeightedQuickUnionUF uf;
    private static final int top=0; //top virtual point
    private final int bottom;
    private int openSites=0;

    public Percolation(int n){
        if(n<=0) throw new IllegalArgumentException();
        grid=new boolean[n][n];
        this.n=n;
        uf=new WeightedQuickUnionUF(n*n+2);
        bottom=n*n+1;
    }

    public void open(int row, int col){
        validateArguments(row,col);
        if(!isOpen(row,col)){
            grid[row - 1][col - 1]=true; //opened the site at row,col

            //now to register the same in the union

            if (row==1){ //if the site is in top row
                uf.union(getSitePosOnGrid(0, col), top); //connect the top row sites to the top virtual point
            }

            if (row==n){ //if the site is in last row
                uf.union(getSitePosOnGrid(n - 1, col), bottom); //connect the last row sites to the bottom virtual point
            }

            //now if the site is present in other rows

            if (row>1 && isOpen(row - 1, col)){ //check if site is not in top row and whether the site on top of it is open
                uf.union(getSitePosOnGrid(row - 1, col), getSitePosOnGrid(row - 2, col));
            }

            if (row<n && isOpen(row + 1, col)){ //check if site is not in last row and whether the site bottom of it is open
                uf.union(getSitePosOnGrid(row - 1, col), getSitePosOnGrid(row, col));
            }

            //now if the site is present in column, which is not at beginning nor end.

            if (col>1 && isOpen(row, col - 1)){ //check if site is not at beginning of the column and whether site behind it, is open.
                uf.union(getSitePosOnGrid(row - 1, col), getSitePosOnGrid(row - 1, col - 1));
            }

            if (col<n && isOpen(row, col + 1)){ //check if site is not at end of the column and whether site after it, is open.
                uf.union(getSitePosOnGrid(row - 1, col), getSitePosOnGrid(row - 1, col + 1));
            }

            openSites+=1;
        }
    }

    public boolean isOpen(int row, int col){
        validateArguments(row,col);
        return grid[row-1][col-1];
    }

    public boolean isFull(int row, int col){
        validateArguments(row,col);
        return uf.find(getSitePosOnGrid(row - 1,col))==uf.find(top); //check if the site is connected to the top
    }

    public int numberOfOpenSites(){
        return openSites;
    }

    public boolean percolates(){
        return uf.find(top)==uf.find(bottom); //check if top and bottom virtual points are connected
    }

    private int getSitePosOnGrid(int row, int col){ // get the site position on the grid
        return (n*row)+col;
    }

    private void validateArguments(int row, int col){
        if(row<=0 || row>n || col<=0 || col>n) throw new IllegalArgumentException();
    }

    public static void main(String[] args){
        int n=5;
        Stopwatch stopwatch=new Stopwatch();
        Percolation percolation=new Percolation(n);
        while(!percolation.percolates()){
            int row=StdRandom.uniformInt(1,n+1);
            int col=StdRandom.uniformInt(1,n+1);
            percolation.open(row,col);
        }
        System.out.println(stopwatch.elapsedTime());
        System.out.println(percolation.numberOfOpenSites());
    }
}
