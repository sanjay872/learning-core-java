package week1.Assessments.PercolationProblem;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

import java.text.DecimalFormat;

public class PercolationStats{

    private double[] fractions;
    private final int numOfTrails;
    private static final double CONFIDENCE_96=1.96;

    public PercolationStats(int n, int trails){
        if(n<=0  || trails<=0) throw new IllegalArgumentException();
        Percolation percolation=new Percolation(n);
        fractions=new double[trails];
        numOfTrails=trails;
        for(int i=0;i<trails;i++){
            while(!percolation.percolates()){
                percolation.open(StdRandom.uniformInt(1,n+1),StdRandom.uniformInt(1,n+1));
            }
            fractions[i]=(double) percolation.numberOfOpenSites()/ (n*n);
        }
    }

    public double mean(){
        return StdStats.mean(fractions);
    }

    public double stddev(){
        return StdStats.stddev(fractions);
    }

    public double confidenceLo(){
        return mean() - ((CONFIDENCE_96*stddev())/Math.sqrt(numOfTrails));
    }

    public double confidenceHi(){
        return mean() + ((CONFIDENCE_96*stddev())/Math.sqrt(numOfTrails));
    }

    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        int trails=Integer.parseInt(args[1]);
        PercolationStats percolationStats=new PercolationStats(n,trails);
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println("mean\t\t\t\t\t= "+df.format(percolationStats.mean()));
        System.out.println("stddev\t\t\t\t\t= "+df.format(percolationStats.stddev()));
        System.out.println("95% confidence interval\t= [ "+df.format(percolationStats.confidenceLo())+", "+df.format(percolationStats.confidenceHi())+"]");
    }
}
