package WIA1002LabAssignment.Lab7Queue.ITheiMa;

public class ITQueue <E> {
    private Node head;//记录头结点
    private Node last;//尾结点
    private int N;//链表的长度


    //内部类：Node节点类
    private class Node{
        public E item;
        public Node next;
        //alt+ins自动生成带参构造
        public Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    //初始化节点(手动初始化)
    public ITQueue() {
        this.head=new Node(null,null); //创建一个空节点名为head
        this.last=null;//尾结点为null
        this.N=0;//链表长度为0
    }

    //判断Queue是否为null
    public boolean isEmpty(){
       return N==0;
    }
    //判断Queue中的size，即元素个数
    public int size(){
        return N;
    }
    //插入元素
    public void add(E e){
        //若链表尾last结点为null
        if (last==null){
            last = new Node(e,null);//创建一个新的last节点
            head.next=last;//头结点head的next指针,指向尾结点
        }
        //若链表尾结点不为null
        else {
           /* //这个是我自创的add方法 ,目的是插入新的首节点，旧的首节点往后移动一位
            //新创建一个首节newFirst,存入元素e，没有指向next
            Node newFirst = new Node(e,null);//null 可以换成head.next，并且删掉下面的newFirst.next=head.next;
            head.next= newFirst;//头节点head的指针指向新插入进来的头结点newFirst
            newFirst.next=head.next;//新插入进了的头结点的next指针指向原来的头结点指向的首节的

*/
            //IT黑马老师的方法【我已经理解真正的原理了】目的是插入新的尾节点，指向null
            Node oldLast=last;//复制一下last节点给oldLast保存起来
            last = new Node(e,null);//创建一个新的尾结点,赋值给之前的last尾结点
            oldLast.next = last;//旧尾结点，指向新插入的尾结点即可（我自己理解的）
        }
        N++;//元素加1
    }
    //删除元素,删除头结点，因为是FIFO先进先出
    public E poll(){
        if (isEmpty()){//或者写isEmpty()，代表如果链表长度为0，return null
            return null;
        }
            //删除首节点,第1个节点指向第3个，断开第2个节点 head->1->2->3->4变成 head->1->3->4
 //head.next = head.next.next;【为什么测试时候这里也不行啊,明明是一样的啊】======================================
            Node oldFirst = head.next; //用这2步代替上面的一步也是一样的意思
            head.next = oldFirst.next;
            N--;


        //如果链表的元素被删完了，那么要重置last=null
        if (isEmpty()){// 或者使用N==0
            last = null;
        }
//返回首节点 【为什么测试方法时候，这里oldFirst.item才对，head.next.item不行啊】================================
        return oldFirst.item;//也就是oldFirst.item。 head.next.item
    }

    //是否包含某个元素
    public boolean contains(E e){
        //需要遍历链表，这个类要实现implements Iterable 接口
        //还没写........
        return false;
    }

    //获取指定索引的元素getElement(int i)
    public int getElement(int i){
        //需要遍历链表，
        //还没写.......
        return -1;
    }

}
