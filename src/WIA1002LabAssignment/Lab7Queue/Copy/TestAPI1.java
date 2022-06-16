package WIA1002LabAssignment.Lab7Queue.Copy;

class Node{ //链表节点
    public int val;
    public Node next;
    public Node(int val){
        this.val=val;
    }
}
public class TestAPI1 {
    public Node head;  //头结点
    public Node last;  //多加的尾结点

    /**
     * 才用尾插法入队
     * @param val
     */

    public void offer(int val){
        Node node=new Node(val);
        if (head==null){ //第一个放入数据
            head=node;
            last=node;
        }else { //不是第一次 尾插法放入
            last.next=node;
            last=last.next;
        }
    }

    public boolean isEmpty(){
        return this.head==null;
    }

    public int poll(){//取走数据删除节点
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int oldVal=this.head.val; //改变指向之前先记录当前头结点的val
        this.head=head.next; //改变指向达到取走数据删除了这一个节点
        return oldVal;
    }
    public int peek(){ //取走数据不删除节点
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int oldVal=this.head.val;
        return oldVal; //与上类似
    }
}
