package week02;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        // Queue
        Queue<Integer> intQueue = new LinkedList<Integer>();

        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

        while(!intQueue.isEmpty()){
            System.out.println(intQueue.poll());
        }

        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());

    }
}
