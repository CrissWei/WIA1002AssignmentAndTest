package WIA1002LabAssignment.Lab7Queue.testJavaAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
    public static void main(String[] args) {

        //他妈的都是一样的，都是从ASCII中最小的开始poll出队列，也就是自然排序
//        getMax();
//        System.out.println("------");
//        getMin();
        testReverseList();
    }

    private static void getMax() {
        //容量为10
        PriorityQueue<String> pq = new PriorityQueue<>(10);
        //add 跟offer是一样的，都是添加元素
        pq.add("D");
        pq.add("a");
        pq.add("c");
        pq.add("F");
        pq.add("E");
        pq.add("A");
        pq.add("BB");
        pq.add("G");
        pq.add("C");
        pq.add("B");
        pq.add("Cris");
        pq.add("Wei");
        pq.add("wei");
        System.out.println(pq.peek());
        System.out.println(pq.size());
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }

    private static void getMin(){
        //容量为10,而且是根据自然排序的倒序
        Queue<String> pq = new PriorityQueue<>(10, Collections.reverseOrder());
        //add 跟offer是一样的，都是添加元素
        pq.offer("B");
        pq.offer("A");
        pq.offer("f");
        pq.offer("G");
        pq.offer("F");
        pq.offer("T");
        pq.offer("2");
        pq.offer("5");
        pq.offer("6");
        pq.offer("a");
        pq.offer("b");
        while (pq.size()>0){ //!pq.isEmpty()
            System.out.println(pq.poll());
        }


    }
    public static void testReverseList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("S");
        list.add("AV");
        list.add("B");
        list.add("W");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.print(object);
        }
        System.out.println();

        String str = "";
        for (String s : list) {
            str+=s;
        }
        System.out.println(str);

        for (String s : list) {
            System.out.print(s);
        }
        System.out.println();

    }

}
