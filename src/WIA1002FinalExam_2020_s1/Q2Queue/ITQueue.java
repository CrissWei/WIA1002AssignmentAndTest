package WIA1002FinalExam_2020_s1.Q2Queue;

/**
 *输入/** 然后按下enter,自动生成
 *
 * @author Criss (Wei Zhang)
 *
 * @param <E>
 * @Name Wei Zhang
 * @ID S2004131
 * @Date 2022/6/17
 *
 */

////压所有警告
@SuppressWarnings("all")
public class ITQueue<E> {
    //内部类：Node节点类
    private class QueueNode {
        public E item;
        public QueueNode next;

        //alt+ins自动生成带参构造
        public QueueNode(E item, QueueNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private QueueNode head;//记录头结点
    private QueueNode last;//尾结点
    private int N;//链表的长度

    //初始化节点(手动初始化)
    public ITQueue() {
        this.head = new QueueNode(null, null); //创建一个空节点名为head
        this.last = null;//尾结点为null
        this.N = 0;//链表长度为0
    }

    //判断Queue是否为null
    public boolean isEmpty() {
        return N == 0;
    }

    //判断Queue中的size，即元素个数
    public int getSize() {
        return N;
    }

    //插入元素
    public void add(E e) {
        //若链表尾last结点为null
        if (last == null) {
            last = new QueueNode(e, null);//创建一个新的last节点
            head.next = last;//头结点head的next指针,指向尾结点
        }
        //若链表尾结点不为null
        else {
           /* //这个是我自创的add方法 ,目的是插入新的首节点，旧的首节点往后移动一位
            //新创建一个首节newFirst,存入元素e，没有指向next
            Node newFirst = new Node(e,null);//null 可以换成head.next，并且删掉下面的newFirst.next=head.next;
            head.next= newFirst;//头节点head的指针指向新插入进来的头结点newFirst
            newFirst.next=head.next;//新插入进了的头结点的next指针指向原来的头结点指向的第一个真正存元素的节点

*/
            //IT黑马老师的方法【我已经理解真正的原理了】目的是插入新的尾节点，指向null
            QueueNode oldLast = last;//复制一下last节点给oldLast保存起来
            last = new QueueNode(e, null);//创建一个新的尾结点,赋值给之前的last尾结点
            oldLast.next = last;//旧尾结点，指向新插入的尾结点即可（我自己理解的）
        }
        N++;//元素加1
    }

    //删除元素,删除头结点，因为是FIFO先进先出
    public E poll() {
        if (isEmpty()) {//或者写isEmpty()，代表如果链表长度为0，return null
            return null;
        }
        //删除首节点,第1个节点指向第3个，断开第2个节点 head->1->2->3->4变成 head->1->3->4
        //head.next = head.next.next;【为什么测试时候这里也不行啊,明明是一样的啊】======================================
        QueueNode oldFirst = head.next; //用这2步代替上面的一步也是一样的意思
        head.next = oldFirst.next;
        N--;


        //如果链表的元素被删完了，那么要重置last=null
        if (isEmpty()) {// 或者使用N==0
            last = null;
        }
//返回首节点 【为什么测试方法时候，这里oldFirst.item才对，head.next.item不行啊】================================
        return oldFirst.item;//也就是oldFirst.item。 head.next.item
    }

    //是否包含某个元素
    public boolean contains(E e) {
        //需要遍历链表，这个类要实现implements Iterable 接口
        //还没写........
        ///////////////////以下是我自己的思路///////////////////
        QueueNode headClone = head;
        while (headClone.next != null) {
            headClone = headClone.next;//往后移动1位，直到headClone移动到尾结点，此时headClone就是尾结点-->null
            if (e.equals(headClone.item)) return true; //参数e和节点item挨个比较是否相等
        }
        return false;
    }

    //获取指定索引的元素getElement(int index)
    public E getElement(int index) {
        //需要遍历链表，
        //还没写.......
        //////////////////////////自己的思路/////////////////////////
        //先判断null的情况
        if (index >= getSize()) return null;//索引太大
        if (head.next == null) return null;//空链表

        QueueNode headClone = head;
        for (int i = 0; i <= index; i++) {//是i <= index ,一共循环【index+1】次
            headClone = headClone.next;//后移一位
        }
        return headClone.item;
    }

    //遍历所以元素
    public void displayAll() {
        QueueNode headClone = head;
        if (headClone.next == null){ //return; //直接结束方法
            System.out.println("Nothing to display");
            return;
    }
            //System.out.println("There are "+getSize()+" items in the queue. Display...");
            while (headClone.next != null) {
                //下面这个语句是为了WIA1002在2020 s1期末考试第2题的要求去写的
            headClone = headClone.next;//往后移动1位，直到headClone移动到尾结点，此时headClone就是尾结点-->null
//            System.out.print(headClone.item + " | ");

                System.out.println(headClone.item);

        }
    }

    @Deprecated //代表该方法已经过时
    public boolean isFull() {
        return getSize() >= Integer.MAX_VALUE;
    }

    /* create a method named changeOrder
     * Accepts one integer parameter k which points to an element
     * in the generic queue from front.Then, change the arrangement
     * of the generics queue so element at position k becomes first in queue.
     * No elements are removed from the queue.
     * 其实题目的要求就是把索引index处的节点变成[真正存数据的头结点：head.next]，size不变
     * */
    public void changeOrder(int index) {
        //循环遍历，找到index前一个位置元素，叫做cur
        QueueNode curPre = head;//记录首节点（head是虚无的，head.next就是第一个真正存元素的节点）

        //如果是从head.next开始就【循环index次，i < index】
        //如果是从head开始就【循环index+1次，i < index+1】
        for (int i = 0; i < index; i++) {
            curPre = curPre.next;//赋值，也就是后移一位，循环
        }

        //断开与cur前后的2个连接，并把pre.next指向-->curNode.next
        QueueNode curNode = curPre.next;
        curPre.next=curNode.next;


        //cur.next--->head.next(索引出节点-->真正的首节的)
        curNode.next=head.next;
        head.next=curNode;//head-->curNode
    }
}
