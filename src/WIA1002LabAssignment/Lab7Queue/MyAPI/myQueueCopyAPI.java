package WIA1002LabAssignment.Lab7Queue.MyAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;

public class myQueueCopyAPI<E> {
    //节点内部类
  /* private class myNode{
        //成员变量
        public E item;  //记录节点元素
        public myNode next;//记录指针

        public myNode(E item, myNode next) {
            this.item = item;
            this.next = next;
        }
    }*/
    //成员变量
    transient Object[] elements;

    transient int head;
    transient int tail;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;


    static final <E> E elementAt(Object[] es, int i) {
        return (E) es[i];
    }
    //空参构造方法
    public myQueueCopyAPI() {
        elements = new Object[16 + 1];
    }

    /**
     * Constructs an empty array deque with an initial capacity
     * sufficient to hold the specified number of elements.
     *
     * @param numElements lower bound on initial capacity of the deque
     */
    public myQueueCopyAPI(int numElements) {
        elements =
                new Object[(numElements < 1) ? 1 :
                        (numElements == Integer.MAX_VALUE) ? Integer.MAX_VALUE :
                                numElements + 1];
    }
    public myQueueCopyAPI(Collection<? extends E> c) {
        this(c.size());
        copyElements(c);
    }
    private void copyElements(Collection<? extends E> c) {
        c.forEach(this::addLast);
    }
    public void addLast(E e) {
        if (e == null)
            throw new NullPointerException();
        final Object[] es = elements;
        es[tail] = e;
        if (head == (tail = inc(tail, es.length)))
            grow(1);
    }

    public void push(E e) {
        addFirst(e);
    }
    public E poll() {
        return pollFirst();
    }
    public E peek() {
        return peekFirst();
    }
    public E pop() {
        return removeFirst();
    }
    public E removeFirst() {
        E e = pollFirst();
        if (e == null)
            throw new NoSuchElementException();
        return e;
    }
    public E pollFirst() {
        final Object[] es;
        final int h;
        E e = elementAt(es = elements, h = head);
        if (e != null) {
            es[h] = null;
            head = inc(h, es.length);
        }
        return e;
    }

    public E peekFirst() {
        return elementAt(elements, head);
    }
    public void addFirst(E e) {
        if (e == null)
            throw new NullPointerException();
        final Object[] es = elements;
        es[head = dec(head, es.length)] = e;
        if (head == tail)
            grow(1);
    }
    public boolean add(E e) {
        addLast(e);
        return true;
    }
    static final int dec(int i, int modulus) {
        if (--i < 0) i = modulus - 1;
        return i;
    }
    static final int inc(int i, int modulus) {
        if (++i >= modulus) i = 0;
        return i;
    }
    private void grow(int needed) {
        // overflow-conscious code
        final int oldCapacity = elements.length;
        int newCapacity;
        // Double capacity if small; else grow by 50%
        int jump = (oldCapacity < 64) ? (oldCapacity + 2) : (oldCapacity >> 1);
        if (jump < needed
                || (newCapacity = (oldCapacity + jump)) - MAX_ARRAY_SIZE > 0)
            newCapacity = newCapacity(needed, jump);
        final Object[] es = elements = Arrays.copyOf(elements, newCapacity);
        // Exceptionally, here tail == head needs to be disambiguated
        if (tail < head || (tail == head && es[head] != null)) {
            // wrap around; slide first leg forward to end of array
            int newSpace = newCapacity - oldCapacity;
            System.arraycopy(es, head,
                    es, head + newSpace,
                    oldCapacity - head);
            for (int i = head, to = (head += newSpace); i < to; i++)
                es[i] = null;
        }
    }
    private int newCapacity(int needed, int jump) {
        final int oldCapacity = elements.length, minCapacity;
        if ((minCapacity = oldCapacity + needed) - MAX_ARRAY_SIZE > 0) {
            if (minCapacity < 0)
                throw new IllegalStateException("Sorry, deque too big");
            return Integer.MAX_VALUE;
        }
        if (needed > jump)
            return minCapacity;
        return (oldCapacity + jump - MAX_ARRAY_SIZE < 0)
                ? oldCapacity + jump
                : MAX_ARRAY_SIZE;
    }
}
