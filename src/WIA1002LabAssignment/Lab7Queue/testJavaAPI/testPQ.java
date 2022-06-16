package WIA1002LabAssignment.Lab7Queue.testJavaAPI;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class testPQ {
    public static void main(String[] args) {
        //testQueue1();
        testPriorityQueue();
    }

    public static void testPriorityQueue(){
        PriorityQueue<String> pq = new PriorityQueue<>(10);
        pq.add("A");
        pq.add("B");
        pq.add("C");
        pq.add("D");
        pq.add("E");
        pq.add("F");
        pq.add("G");
        System.out.println(pq.size());

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        pq.add("ZW");
        pq.add("WD");
        System.out.println(pq.size());
        System.out.println(pq.remove());//remove 相当于是 poll
        //System.out.println(pq.remove());//poll
        System.out.println(pq.remove());//remove会报错，因为null，但是poll不会报错
        System.out.println(pq.poll());//不会报错，是null

        System.out.println(pq.size());
        pq.clear();
        pq.add("9");
        System.out.println(pq.size());

    }

    public static void testQueue1(){
        Queue queue = new ArrayDeque();
        queue.add(666);
        queue.add(777);
        queue.add("zhang");
        queue.add("wei");

        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());


        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println(queue.size());
    }

}
