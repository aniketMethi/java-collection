import java.util.LinkedList;
import java.util.Queue;

public class ExploreLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(50);
        queue.offer(100);
        queue.offer(150);
        queue.offer(200);

        System.out.println(queue);

        //it will remove and return head
        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue);

    }
}
