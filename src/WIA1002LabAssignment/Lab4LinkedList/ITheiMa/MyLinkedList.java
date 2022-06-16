package WIA1002LabAssignment.Lab4LinkedList.ITheiMa;

import java.util.Iterator;

/*
*   Node2 curNode = preNode.next;//当前节点curNode
        Node2 nextNode = curNode.next;//当前节点的下一个节点nextNode
        //Y的前一个节点X--指向->Y的后一个节点Z，Y被删除，由原来的X->Y->Z变成X->Z
        preNode.next = nextNode;
* */
public class MyLinkedList <E> implements Iterator<E> {
    private Node2 head;//记录头结点
    private int size;//记录链表长度

    @Override
    public boolean hasNext() {
        return head.next!=null;
    }

    @Override
    public E next() {
        head = head.next;
        return head.item;
    }


    //节点内部类
    private class Node2 { //不需要Node<E>
        E item;
        Node2 next;

        //alt+ins 全参构造
        public Node2(E item, Node2 next) {
            this.item = item;
            this.next = next;
        }
    }

    //空参构造，初始化
    public MyLinkedList() {
        //初始化头结点为null ,默认值是null
        this.head = new Node2(null,null);
        //初始化链表长度为0
        this.size = 0;

    }

    //clear list清空链表
    public void clear(){
        head.next=null;//设置头结点指向null
        this.size=0;//大小为0
    }

    public int length(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    //根据索引获取节点
    //方法： 要想找到 i 处的元素，就遍历 i 次，从0<= index <i，(i=0是head头结点)
    public E get(int i){
        //head 索引为0，head.next索引为1
        Node2 node = head.next;//记录头结点的下一个节点,索引为1。赋值

        if (node.next==null) return null;//自己先判断是不是null空链表
        if (i>length()) return null;  //自己判断，如果i长度比链表长度大，返回Null

        //遍历链表 i 次，直到索引 i 处停下，然后返回索引 i 处的元素
        for (int index = 0; index < i; index++) {
            node = node.next; //后一个节点赋值给上一个节点，也可理解为当前节点后移1位，移动i-1次,就到了i处的位置
        }
        return node.item; //返回节点真正存储的元素
    }

    //插入新的元素（在最链表的最末尾插入即可）
    public void add(E e){
     /*   【这个是我的方法，改动老师的】
     //找到当前最末尾的节点

        //Node node = head;  //头结点
        while (head.next!=null){ //只要头结点的下一个节点不是null，就一张循环直到为最后一个node
            head = head.next; //下一个node节点赋值给上一个节点
        }
        head.next = new Node(e,null);
        size++;*/
        ///////////////////////////////////////
        //【下面这个是老师的演示方法】
        //找到当前最末尾的节点
        Node2 node = head;   //记录头结点。赋值】】
        //方法：只要头结点的下一个节点不是null，就一张循环直到为最后一个node
        while (node.next!=null){
            node = node.next; //下一个node节点赋值给上一个节点
        }
        //node.next = new Node(e,null);
        Node2 lastNode = new Node2(e,null);
        node.next =lastNode;//当前最后一个节点--->指向新的尾节点
        size++;
    }
    //在索引 i 处插入一个元素 e  【这个insert(int i, E e)方法完全是我自己写的，没有参考老师的】
    public void add(int i, E e){ //有问题可能是 index < i-1;
        //if (i>=length()) return;

        //head 索引为0，head.next索引为1.赋值
        Node2 preNode = head;

        //遍历链表 i 次，直到索引 i 处停下，然后返回索引 i 处的元素
        for (int index = 0; index < i; index++) {
            //后一个节点赋值给上一个节点，
            //也可理解为当前节点后移1位，移动i-1次,就到了i处的位置,此时node.item就是元素
            preNode = preNode.next;//获取当前i出的前1个节点,就是preNode
        }

//////////////////////////////
     /*   //创建一个新插入的节点，索引为 i，待插入
        Node2 curNode = new Node2(e,null);
        //使得索引i处的当前节点(curNode)的前一个节点(preNode)--->指向curNode
        preNode.next=curNode;
        //然后当前节点指向--->前一个节点插入curNode之前的下一个节点:preNode.next
        curNode.next=preNode.next;*/
////////////////////////////////
        //老师的方法也可以，差不多
        //    head->A->B->C->D->null，现在要在索引3处插入一个X：head->A->B->X->C->D->null
        //索引：0    1  2  3  4                           索引：0    1  2  3  4  5
        //preNode就是 B, preNode.next原来是C，也就是下面的oldCurNode
        Node2 oldCurNode = preNode.next; //B->X ，oldCurNode是C
        //newCurNode.next是oldCurNode  X.next 是C，X--->C
        Node2 newCurNode = new Node2(e,oldCurNode);//创建新的节点 X
        //Cur.next=preNode.next;//X-->C
        preNode.next=newCurNode;//前一个节点指向刚插入的新节点

        size++;//节点++

    }

    //根据索引删除对应的元素，并返回删除的元素
    public E remove(int i){
        //删除索引 i 处的该元素。
        //删除方法：该元素的前一个node，指向该元素的后一个node，断开该元素在链表的next指针
        Node2 preNode = head;//记录头结点。赋值

        if (preNode.next==null) return null;//自己先判断是不是空链表
        if (i>length()) return null;  //自己判断，如果i长度比链表长度大，返回Null

            //遍历链表直到索引 i 处停下，然后返回索引 i 处的元素
        for (int index = 0; index < i; index++) {
            preNode = preNode.next; //后一个节点赋值给上一个节点
        }
        Node2 curNode = preNode.next;//当前节点curNode
        Node2 nextNode = curNode.next;//当前节点的下一个节点nextNode
        //Y的前一个节点X--指向->Y的后一个节点Z，Y被删除，由原来的X->Y->Z变成X->Z
        preNode.next = nextNode;

        size--;//长度 -1
        //E e = get(i);//调用上面的方法得到索引i处的元素，直接return返回该元素
        //return e;//返回索引 i 处被删除的元素
        return curNode.item;//返回索引 i 处被删除的元素
    }

    //获取元素的索引号码
    public int indexOf(E e){
        if (isEmpty()) return -1;
        Node2 node = head;//记录头结点,null
        //遍历所有的元素。一一对比
        int i=0;
        while (node.next!=null){
            node = node.next;
            if (node.item.equals(e)) {
                return i;
            }
            i++;
        }
        return  -1;
    }

    //跟上面的indexOf方法是一样的
    public int indexOf2(E e){
        if (isEmpty()) return -1;
        Node2 node = head;
        for (int i = 0; node.next!=null; i++) {
            node = node.next;
            if (node.item.equals(e)){
                return i ;
            }
        }
        return -1;
    }

}
