package WIA1002LabAssignment.Lab7Queue.ITheiMa;

public class ITQueueTest {
    public static void main(String[] args) {
        ITQueue<String> que = new ITQueue<>();
        que.add("aa");// 为什么不见了
        que.add("bbbb");// 为什么不见了
        que.add("拜拜");// 为什么不见了
        que.add("ZHANG");
        que.add("WEI");
        que.add("Cris");
        que.add("无敌");
        que.add("啊");

        System.out.println(que.isEmpty());
        System.out.println(que.size());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());

        System.out.println(que.size());
        System.out.println(que.contains("WEI"));//还没写实现内容
        System.out.println(que.getElement(1));//还没写.......
    }
}
