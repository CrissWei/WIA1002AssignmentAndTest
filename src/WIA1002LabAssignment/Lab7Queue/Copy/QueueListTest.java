package WIA1002LabAssignment.Lab7Queue.Copy;

public class QueueListTest {
    public static void main(String[] args) {
        QueueList<String> list = new QueueList<String>();
        list.pushBack("11");
        list.pushBack("22");
        list.pushBack("33");
        System.out.println(list.popFront().getValue());
        System.out.println(list.popFront().getValue());
        System.out.println(list.popFront().getValue());
    }
}
