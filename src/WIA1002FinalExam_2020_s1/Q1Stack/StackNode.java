package WIA1002FinalExam_2020_s1.Q1Stack;

import java.util.Iterator;

public class StackNode<E> implements Iterable<E> {
    
    //内部类
    private class Node {
        //成员变量
        public E item;
        public Node next;


        public Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    //成员变量
    private Node head;
    //private Node last;
    private int size;

    //空参构造。初始化，设置默认值
    public StackNode() {
        this.head = new Node(null, null);
        this.size = 0;
    }

    //全参构造，用不到
    public StackNode(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

  /*  跟peek是一样的功能
  public E getFirst() {
        if (isEmpty())return null;
        return head.next.item; //head是null，head的下一个才是第一个真正存储元素的节点
    }*/

    //添加第一个元素
    public void push(E e) { //从head->A->B->C->null ,变成 head->e->A->B->C->null
        Node A = head.next;//记录节点A
        Node X = new Node(e, null);//创建新的节点X，不指向下一个
        head.next = X;  //head->X
        X.next = A;//X->A
        size++;
     /*
        //或者
        Node A1 = head.next;//记录节点A1
        Node X1 = new Node(e,A1);
        head.next=X1;  //head->X1

        //或者更简单一点，合二为一
        Node A2 = head.next;//记录节点A2
        head.next= new Node(e,A2);//head->e->A2
      */
    }

    //返回第一个，不删除
    public E peek() {
        if (isEmpty()) return null;
        //return getFirst().item;
        return head.next.item;
    }

    //删除第一个元素
    public E pop() {
        if (isEmpty()) return null;
        //head.next=head.next.next;//删除head.next
        Node cur = head.next;
        Node curNext = cur.next;
        head.next = curNext;

        size--;
        return cur.item; //不能写head.next.item
    }

    //根据索引index查找元素e
    public E search(int index) {
        if (isEmpty()) return null;
        if (index > size) return null;
        //if (head.next==null) return null;
        Node node = head;//用node来代替记录head
        //if (node.item==null) return null;
        if (node.next == null) return null;

        for (int i = 0; i <= index; i++) {//【循环index+1次】
            node = node.next;//赋值，也就是后移一位，循环
        }
        return node.item;
    }

    //返回元素e处的索引(第一次出现e)
    public int indexOf(E e) {
        if (isEmpty()) return -1;
        int count = 0;
        //不能直接用head,要用一个node来代替head
        Node node = head;
        while (node.next != null) {//head.item.equals(e)
            node = node.next;
            if (node.item.equals(e)) return count;
            count++;
        }
        return -1;
    }

    public int indexOf2(E e) {
        if (isEmpty()) return -1;
        Node node = head;//head赋值给node。用node来代替head
        if (node.next == null) return -1;

        for (int i = 0; node.next != null; i++) {
            node = node.next;
            if (node.item.equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        head.next = null;
        size = 0;
    }

    //额外功能，判断stack是不是满了
    public boolean isFull() {
       /* if (size>=Integer.MAX_VALUE) return true;
        return false;*/
        return size >= Integer.MAX_VALUE;
    }

    /*  public E popAll(){
     //clear();
      while (!isEmpty()) {
          pop();//一个一个pop
      }
      return peek();}*/
    //全部弹出，删除元素
    public void popAll() {
        while (!isEmpty()) {
            System.out.println(peek());
            pop();
        }

       /*
        //if (isEmpty()) return;
        //这里怎么回事啊？ i <= getSize()+4，测试居然正确，
       因为i < getSize(); 这个在pop里面也有size--
       所以这里最后别用for循环
       for (int i = 0; i < getSize(); i++) {
            System.out.println(peek());
            pop();
        }*/
    }

    //一次性添加几个元素
    public void pushMany(E e1, E e2, E e3) {
        Node A = head.next;//记录节点A
        size = size + 3;
    }

    //如果是奇数，删除中间的元素
    public E popMiddle() {

        if (isEmpty()) return null;
        if (size % 2 == 0) return null;
        //是odd奇数，假如size=9,那么索引012345678, middle=4=size/2
        //if (size%2!=0) return search(size/2);//这个更加方便

        //下面是为了删除中间的节点==========
        Node preNode = head;//用node来代替记录head
        for (int i = 0; i < size / 2; i++) {//【循环index+1次】
            preNode = preNode.next;//赋值，也就是后移一位，循环
        }
        Node curNode = preNode.next;//保存cur当前节点B ，preNode是A， A->B->C
        preNode.next = curNode.next;//A->C ,删除B
//        Node nextNode = curNode.next;
//        preNode.next=nextNode;
        size--;
        return curNode.item;
    }

    //遍历所有元素，但不删除 ,
    public void displayAll() {
        //peek();
        for (int i = 0; i < size; i++) {
            System.out.println(search(i));//完美遍历
        }
    }


    @Override
    public Iterator<E> iterator() {
        return new IteratorImpl();

    }

    //内部类
    public class IteratorImpl implements Iterator {
        //成员变量，记录当前节点
        private Node node;

        public IteratorImpl() {
            this.node = head; //初始化
        }

        @Override
        public boolean hasNext() {
            return node.next != null;
        }

        @Override
        public Object next() {
            node = node.next;
            return node.item;
        }
    }

}
