package WIA1002FinalExam_2020_s1.Q1Stack;

/**
 * @name Wei Zhang
 * @ID S2004131
 * @Date 2022/6/16
 */

public class Q1Answer2 {
    public static void main(String[] args) {
        myInner<String> letter = new myInner<>();

        System.out.println(letter.isEmpty());
        System.out.println(letter.getSize());
        System.out.println("==========");

        letter.push("A");
        letter.push("B");
        letter.push("C");
        letter.push("D");
        System.out.println(letter.peek());//D 没错
        letter.push("E");
        letter.push("F");
        letter.push("G");

        System.out.println("=====display all遍历不删除=====");
        letter.displayAll();
        System.out.println("==========");

        System.out.println(letter.getSize());
        System.out.println("======获取中间值====");
        System.out.println(letter.popMiddle());//没错

        System.out.println("==========");
        System.out.println(letter.getSize());
        System.out.println("==========");
        letter.push("H");
        System.out.println(letter.getSize());
        System.out.println("==========");

        System.out.println(letter.peek());//没错
        System.out.println(letter.pop());//删除 对了
        System.out.println(letter.isEmpty());
        System.out.println(letter.getSize());
        System.out.println("==========");
        System.out.println("======获取中间值====");
        System.out.println(letter.popMiddle());//没错
        System.out.println(letter.getSize());
        System.out.println("=====");
        letter.push("X");
        System.out.println(letter.getSize());
        System.out.println("======获取中间值====");
        System.out.println(letter.popMiddle());//没错
        System.out.println(letter.getSize());
        System.out.println("============");

        //现在还剩A<-B<-C  <-F<-G <-X ,删除了D E H
        System.out.println(letter.indexOf("A"));
        System.out.println(letter.indexOf2("B"));
        System.out.println(letter.indexOf2("C"));
        System.out.println(letter.indexOf2("D"));
        System.out.println(letter.indexOf2("E"));
        System.out.println(letter.indexOf2("G"));
        System.out.println(letter.indexOf2("X"));

        System.out.println("===========");
        System.out.println(letter.search(0));
        System.out.println(letter.search(1));
        System.out.println(letter.search(2));
        System.out.println(letter.search(3));
        System.out.println(letter.search(4));
        System.out.println("==========");
        letter.push("维哥");
        System.out.println("=====display all遍历不删除=====");
        letter.displayAll();
        System.out.println("==========");

        System.out.println("=====pop all,按个删除=====");
        //跟clear一样的效果
        letter.popAll();
        System.out.println("=========");

        System.out.println(letter.isEmpty());

        System.out.println("==========");
        letter.push("Cris");
        letter.push("is");
        letter.push("name");
        letter.push("my");
        System.out.println(letter.getSize());
        System.out.println("====");
        letter.displayAll();
        System.out.println("====");
        letter.clear();
        System.out.println(letter.isEmpty());
    }

///////////////////////////////////////////////////////////////////////////////

    //这里是static
    public static class myInner<E> {
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
        public myInner() {
            this.head = new Node(null, null);
            this.size = 0;
        }

        //全参构造，用不到
        public myInner(Node head, int size) {
            this.head = head;
            this.size = size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int getSize() {
            return size;
        }

        //添加第一个元素
        public void push(E e) { //从head->A->B->C->null ,变成 head->e->A->B->C->null
            Node A = head.next;//记录节点A
            Node X = new Node(e, null);//创建新的节点X，不指向下一个
            head.next = X;  //head->X
            X.next = A;//X->A
            size++;
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
            Node curNode = head;//用curNode来代替记录head
            //if (curNode.item==null) return null;
            if (curNode.next == null) return null;

            for (int i = 0; i <= index; i++) {//【循环index+1次】
                curNode = curNode.next;//赋值，也就是后移一位，循环
            }
            return curNode.item;
        }

        //返回元素e处的索引(第一次出现e)
        @Deprecated
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

            return size >= Integer.MAX_VALUE;
        }

        public void popAll() {
            while (!isEmpty()) {
                System.out.println(peek());
                pop();
            }
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

    }

}
