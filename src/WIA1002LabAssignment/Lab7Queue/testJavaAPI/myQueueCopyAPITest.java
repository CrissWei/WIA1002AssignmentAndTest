package WIA1002LabAssignment.Lab7Queue.testJavaAPI;

import WIA1002LabAssignment.Lab7Queue.MyAPI.myQueueCopyAPI;

public class myQueueCopyAPITest {
    public static void main(String[] args) {
        myQueueCopyAPI<String> letter = new myQueueCopyAPI<>();
        letter.push("Begin");
        letter.push("A");
        letter.push("B");
        System.out.println(letter.poll());//应该是第一个：Begin,实际是最后一个：B
        letter.push("C");
        System.out.println(letter.peek());
        letter.push("D");
        letter.push("E");
        System.out.println(letter.pop());//removeFirst 弹出
        letter.addFirst("第1");
        letter.addFirst("第11");
        System.out.println(letter.poll());
        letter.addFirst("第111");
        System.out.println(letter.removeFirst());
        System.out.println(letter.pollFirst());




    }
}
