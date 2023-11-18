package week3.assessment.collinear;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class BruteCollinearPoints {
    private final LineSegment[] lineSegments;

    public BruteCollinearPoints(Point[] points){
        if(points==null)
            throw new IllegalArgumentException();
        for (Point point : points) {
            if(point==null){
                throw new IllegalArgumentException();
            }
        }
        Point[] localPoints=points.clone();
        Arrays.sort(localPoints);

        for(int i=0;i<localPoints.length-1;i++){
            if(localPoints[i].compareTo(localPoints[i+1])==0){
                throw new IllegalArgumentException();
            }
        }
        ArrayList<LineSegment> res=new ArrayList<>();
        for(int i=0;i<localPoints.length-3;i++){
            for(int j=i+1;j<localPoints.length-2;j++){
                for(int k=j+1;k<localPoints.length-1;k++){
                    for(int l=k+1;l<localPoints.length;l++){
                        if(Double.compare(localPoints[i].slopeTo(localPoints[j]),localPoints[i].slopeTo(localPoints[k]))==0){
                            if(Double.compare(localPoints[i].slopeTo(localPoints[k]),localPoints[i].slopeTo(localPoints[l]))==0)
                            {
                                LineSegment ls=new LineSegment(localPoints[i],localPoints[l]);
                                res.add(ls);
                            }
                        }
                    }
                }
            }
        }
        lineSegments=res.toArray(new LineSegment[res.size()]);
    }

    public int numberOfSegments(){
        return lineSegments.length;
    }

    public LineSegment[] segments(){
        return lineSegments.clone();
    }

    public static void main(String[] args) {

        // read the n points from a file
        In in = new In(args[0]);
        int n = in.readInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            int y = in.readInt();
            points[i] = new Point(x, y);
        }

        //for testing data in local
//        int[] x_6values=new int[]{19000,18000,32000,21000,1234,14000};
//        int[] y_6values=new int[]{10000,10000,10000,10000,5678,10000};
//        int[] x_8values=new int[]{10000,0,3000,7000,20000,3000,14000,6000};
//        int[] y_8values=new int[]{0,10000,7000,3000,21000,4000,15000,7000};
//        int n = x_8values.length;
//        Point[] points = new Point[n];
//        for (int i = 0; i < n; i++) {
//            int x = x_8values[i];
//            int y = y_8values[i];
//            points[i] = new Point(x, y);
//        }

        // draw the points
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
        for (Point p : points) {
            p.draw();
        }
        StdDraw.show();

        // print and draw the line segments
        BruteCollinearPoints collinear = new BruteCollinearPoints(points);
        for (LineSegment segment : collinear.segments()) {
                StdOut.println(segment);
                segment.draw();
        }
        StdDraw.show();
    }
}
