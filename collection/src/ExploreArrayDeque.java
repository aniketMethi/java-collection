import java.util.ArrayDeque;
import java.util.Queue;

public class ExploreArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offer(15);
        deque.offerFirst(30);
        deque.offerLast(100);
        deque.offer(10);

        System.out.println(deque);

        System.out.println("Peek");
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println("*************");

        System.out.println(deque);

        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());


    }
}
