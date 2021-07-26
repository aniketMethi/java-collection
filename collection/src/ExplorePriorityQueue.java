import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExplorePriorityQueue {

    public static void main(String[] args) {

        //min heap
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(100);
        queue.offer(150);
        queue.offer(200);
        queue.offer(50);

        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        System.out.println(queue.peek());

        //max heap
        Queue<Integer> queue1 = new PriorityQueue<>(Comparator.reverseOrder());

        queue1.offer(100);
        queue1.offer(150);
        queue1.offer(200);
        queue1.offer(50);

        System.out.println(queue1);

        queue1.poll();
        System.out.println(queue1);

        System.out.println(queue1.peek());


    }


}


