package WIA1002FinalExam_2020_s1.Q4HashMap;

/**
 * @author Criss (English name)
 * @Name WEI ZHANG
 * @ID S2004131
 * @Date 2022/6/17
 *
 * This map is first in last out like stack.
 */

public class MyHashMap<Key, Value> {
    //////////////////////
    //inner class
    private class MapNode {
        //MapNode类的成员变量
        //member variables not local variables
        public Key key;
        public Value value;
        public MapNode next;

        public MapNode(Key key, Value value, MapNode next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
/////////////////////

    //MyHashMap类的成员变量
    //member variables not local variables
    private final MapNode head;//make it final so never change head
    private int size;

    public MyHashMap() {
        //Initialize variables
        this.head = new MapNode(null, null, null);
        this.size = 0;
    }

    //get the size of MyHashMap
    public int getSize() {
        return size;
    }

    //is empty or not
    public boolean isEmpty() {
        //return getSize()==0;
        return size == 0;
    }

    //put key and value, and 100% can put it successfully
    public void put(Key key, Value value) {
        MapNode cur = head;
        while (cur.next != null) {
            cur = cur.next; //move to next
            //if the same key,then just update
            if (key.equals(cur.key)) {
                //update the value
                cur.value = value;
                return;//to end
                //size++; dont need to,just update,not create a new MapNode
            }
        }
        //if no key, then add a newNode and let it be the second MapNode after head
        //create a new MapNode, make head--->newNode-->curNext-->....-->null
        MapNode curNext = head.next;
        MapNode newNode = new MapNode(key, value, curNext);//newNode-->curNext
        head.next = newNode;//head--->newNode

        size++;//even update , also +1
    }


    //remove K&V according to key
    public void remove(Key key) {
        MapNode pre = head;
        while (pre.next != null) {
            //pre.next = pre.next.next; //move to next
            //pre.next.key,,find the pre one
            if (key.equals(pre.next.key)) {
                //delete the key and value
//                pre.key = null;
//                pre.value=null;
                MapNode cur = pre.next;//need to delete the cur Node
                pre.next=cur.next;

                size--;
                return;//must end it
            }
            pre= pre.next; //move to next
        }
        // pre.next is always null,because pre.next is already the last one
        //MapNode curNext = pre.next;
    }

    //remove K&V according to index
    @Deprecated
    //sometimes correct, sometimes not
    public void remove(int index) {
        //if (isEmpty()) return; //end it

        MapNode pre = head;
        for (int i = 0; i < index; i++) {
            pre=pre.next;
        }
        MapNode cur = pre.next;
        pre.next=cur.next;

        size--;
    }

    public void removeFirst() {

    }

    public void removeLast() {

    }

    public void removeAll() {
        head.next = null;
        size = 0;
    }

    public void displayAll() {
        MapNode cur = head;
        while (cur.next != null) {
            cur = cur.next; //move to next
            System.out.println(cur.key+", "+cur.value);
        }
    }

    //get the value according to the key
    public Value getValue(Key key) {
        MapNode cur = head;
        if (cur.next == null) return null;//better to add first,but can also delete
        while (cur.next != null) {
            cur = cur.next; //move to next
            if (key.equals(cur.key)) {
                //get the value
                return cur.value;
            }
        }
        return null;
    }
}
