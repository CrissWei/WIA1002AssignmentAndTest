package WIA1002LabAssignment.Lab6Stack.API;

import java.util.EmptyStackException;
import java.util.Vector;

/*
* 这里面的API是我自己抄底JAVA 中Stack的源码
* */
public class StackAPI<E> extends Vector<E> {
    public StackAPI() {
    }

    /**
     * Pushes an item onto the top of this stack. This has exactly
     * the same effect as:
     * <blockquote><pre>
     * addElement(item)</pre></blockquote>
     *
     * @param   item   the item to be pushed onto this stack.
     * @return  the {@code item} argument.
     * @see     java.util.Vector#addElement
     */

    //int i; 为了计算size大小
    public E push(E item) {
        addElement(item);
        //i++;是为了计数的，计算size大小
        return item;
    }
    public synchronized E pop() {
        E       obj;
        int     len = size();

        obj = peek();
        removeElementAt(len - 1);

        return obj;
    }
    public synchronized E peek() {
        int     len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }
    public boolean empty() {
        return size() == 0;
    }
    public synchronized int search(Object o) {
        int i = lastIndexOf(o);

        if (i >= 0) {
            return size() - i;
        }
        return -1;
    }

    public int getSize() {
        return size();
        //return i;或者这个也行，自己想的
    }
}
