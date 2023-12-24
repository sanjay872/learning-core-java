package week4.problem;

public class TestMain {
    public static void main(String[] args) {
        int max=10;
        UnOrderedMaxPQ<Integer> pq=new UnOrderedMaxPQ<>(max);
        pq.insertKey(10);
        pq.insertKey(4);
        pq.insertKey(2);
        pq.insertKey(76);
        pq.insertKey(21);
        pq.insertKey(4);
        pq.insertKey(24);
        pq.insertKey(53);
        pq.insertKey(85);
        pq.insertKey(31);

        System.out.println( pq.deMax());
        System.out.println( pq.deMax());
    }
}
