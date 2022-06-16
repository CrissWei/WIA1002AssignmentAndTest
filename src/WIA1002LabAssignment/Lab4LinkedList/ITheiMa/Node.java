package WIA1002LabAssignment.Lab4LinkedList.ITheiMa;

public class Node<E> {
    public E item;//存储元素
    public Node next;//指向下一个节点
    public String name;//为了方便理解

    public Node(String name) {
        this.name = name; //类似于Student的name
    }

    //alt+insert 全参构造
    public Node(E item, Node next) {
        this.item = item;
        this.next = next;
    }

}
