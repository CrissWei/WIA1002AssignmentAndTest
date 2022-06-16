package WIA1002LabAssignment.Lab7Queue.MyAPI;

public class myQueue<E> {
    //节点内部类
   private class myNode{
        //成员变量
        public E item;  //记录节点元素
        public myNode next;//记录指针

        public myNode(E item, myNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private myNode head;
    private myNode last;
    private int size;

    public myQueue() {
        //初始化节点
        this.head=new myNode(null,null);//设置头节点为null
        this.last=null;
        this.size=0;//初始化设置链表长度是0
    }
    public boolean isEmpty(){
        return size==0;
    }

    public int getSize() {
        return size;
    }

    public E getHead() {
        return head.next.item;
    }

    public E getLast() {
        return last.item;
    }

    public void push(E e){

    }
    public boolean push(int index, E e){

        return false;
    }


    public E pull(){

        return null;
    }
    public E peak(){
        if (head.next==null) return null;
        return head.next.item;
    }
    public int indexOf(E e){

        return -1;
    }

    public E getNode(int index){
        return null;
    }

 /*  public static final <E> E elementAt(Object[] es, int i) {
        return (E) es[i];
    }*/
}
