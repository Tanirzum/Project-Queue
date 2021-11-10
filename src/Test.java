import java.util.*;

public class Test {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Tanir");
        queue.offer("Zhanibek");
        queue.offer("Aman");
        queue.offer("Almas");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
