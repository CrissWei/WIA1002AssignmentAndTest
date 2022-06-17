package WIA1002FinalExam_2020_s1.Q2Queue;

import WIA1002LabAssignment.Lab7Queue.ITheiMa.ITQueue;

/**
 * @name Wei Zhang
 * @ID S2004131
 * @Date 2022/6/17
 * */
public class ITQueueTest {
    public static void main(String[] args) {
        WIA1002LabAssignment.Lab7Queue.ITheiMa.ITQueue<String> que = new ITQueue<>();
        que.add("a");//
        que.add("bb");//全部正确
        que.add("拜拜");// 为什么不见了
        que.add("ZHANG");
        que.add("WEI");
        que.add("Cris");
        que.add("无敌");
        que.add("啊aa");
        System.out.println("=======遍历所有元素========");
        que.displayAll();
        System.out.println("===============");

        System.out.println(que.isEmpty());
        System.out.println(que.getSize());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());

        System.out.println(que.getSize());
        System.out.println(que.contains("WEI"));//全部正确
        System.out.println(que.contains("Cris"));
        System.out.println(que.contains("无敌"));
        System.out.println(que.contains("啊aa"));
        System.out.println(que.contains("什么鬼"));

        System.out.println("=======遍历所有元素========");
        que.displayAll();
        System.out.println("===============");

        System.out.println(que.getElement(0));//全部正确
        System.out.println(que.getElement(1));
        System.out.println(que.getElement(2));
        System.out.println(que.getElement(3));
        System.out.println(que.getElement(4));
        System.out.println(que.getElement(5));

        System.out.println("=======");
        que.displayAll();
        que.changeOrder(2);//非常正确
        System.out.println("===");
        que.displayAll();

    }
}
