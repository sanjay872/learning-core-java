package week4.assessment.shufflePuzzle;

import java.util.Arrays;

public class Board {

    private int[] board;
    private final int offset=1;
    private final int width;

    public Board(int[][]tiles){
        board=new int[tiles.length*tiles.length];
        width=tiles.length;
        int k=0;
        for(int i=0;i<width;i++){
            for(int j=0;j<width;j++){
                board[k++]=tiles[i][j];
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(width).append("\n");
        for(int i=0;i<board.length;i++){
            if(((i+1)%width)!=0)
                sb.append(board[i]).append(" ");
            else
                sb.append(board[i]).append("\n");
        }
        return sb.toString();
    }

    public int dimension(){
        return width;
    }

    public int hamming(){
        int h=0;
        for(int i=0;i<board.length;i++){
            if(board[i]!=0&&board[i]!=i+1)
                h++;
        }
        return h;
    }

    public void manhattan(){
        int m=0;
        for(int i=0;i<board.length;i++){
            if(board[i]!=0&&board[i]!=i+1){
                System.out.print(positionMis(board[i],i+1)+" ");
            }
        }
    }

    private int positionMis(int val, int curPos){
        return Math.abs(((val-curPos)/width)+1);
    }

    public static void main(String[] args) {
        int[][] tiles1=new int[][]{{0,1,3},{4,2,5},{7,8,6}};
        int[][] tiles2=new int[][]{{8,1,3},{4,0,2},{7,6,5}};
        Board board=new Board(tiles2);
        for(Integer b:board.board){
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.println(board);
        System.out.println(board.hamming());
        board.manhattan();
    }




}
