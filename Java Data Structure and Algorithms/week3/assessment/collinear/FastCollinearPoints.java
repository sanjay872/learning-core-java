package week3.assessment.collinear;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class FastCollinearPoints {

    private LineSegment[] lineSegments;

    public FastCollinearPoints(Point[] points){

        // validation check
        if(points==null)
            throw new IllegalArgumentException();
        for (Point point : points) {
            if(point==null){
                throw new IllegalArgumentException();
            }
        }

        Point[] localPoints=points.clone(); // to avoid modify of the actually points
        Arrays.sort(localPoints);

        // to check for duplicates
        for(int i=0;i<localPoints.length-1;i++){
            if(localPoints[i].compareTo(localPoints[i+1])==0){
                throw new IllegalArgumentException();
            }
        }

        ArrayList<LineSegment> res = new ArrayList<>();
        if(localPoints.length>3){ // at least 3 points required
            Point[] tempPoints=localPoints.clone();
            for (Point pointP : localPoints) { // point p
                Arrays.sort(tempPoints, pointP.slopeOrder()); // sort the points based on the slope of point p
                int start = 1; // because in the sorted array the index 0 will have the point p
                double pointQ_slop = pointP.slopeTo(tempPoints[start]); // slope of p->q
                for (int j = 2; j < tempPoints.length; j++) { // point r, starts from index 2
                    double pointR_slop = pointP.slopeTo(tempPoints[j]); // slope of p->r
                    if (Double.compare(pointR_slop, pointQ_slop) != 0) { // when the slopes are not equal
                        if (j - start >= 3) { // check if we got at least 3 points of same slop
                            Point[] ls_points = generateLinearSegmentPoints(tempPoints, pointP, start, j);
                            if (ls_points[0].compareTo(pointP) == 0) { // check if we got the correct origin point
                                res.add(new LineSegment(ls_points[0], ls_points[1]));
                            }
                        }
                        start = j; // update the position
                        pointQ_slop = pointR_slop; // update the points
                    }
                }
                if (tempPoints.length - start >= 3) {
                    Point[] lastLs_points = generateLinearSegmentPoints(tempPoints, pointP, start, points.length);
                    if (lastLs_points[0].compareTo(pointP) == 0) {
                        res.add(new LineSegment(lastLs_points[0], lastLs_points[1]));
                    }
                }
            }
        }
        lineSegments = res.toArray(new LineSegment[res.size()]);
    }

    private Point[] generateLinearSegmentPoints(Point[] points, Point pointP, int start, int end) {
        ArrayList<Point> temp=new ArrayList<>();
        temp.add(pointP); //point p at start
        temp.addAll(Arrays.asList(points).subList(start, end));
        temp.sort(null); // sort them by default compareTo, which is by coordinates
        return new Point[]{temp.get(0),temp.get(temp.size()-1)};
    }

    // the number of line segments
    public int numberOfSegments() {
        return lineSegments.length;
    }

    // the line segments
    public LineSegment[] segments() {
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
        FastCollinearPoints collinear = new FastCollinearPoints(points);
        for (LineSegment segment : collinear.segments()) {
            StdOut.println(segment);
            segment.draw();
        }
        StdDraw.show();
    }

}
