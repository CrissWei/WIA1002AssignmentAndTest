package WIA1002LabAssignment.Lab7Queue.MyAPI;

public class Student<E> {

    //内部类
    private class myStudent {
        public E itemName;
        public myStudent ageNext;
        //alt+ins
        public myStudent(E itemName, myStudent ageNext) {
            this.itemName = itemName;
            this.ageNext = ageNext;
        }
    }

    private myStudent head;
    private myStudent last;
    private int size;

    public Student() {
        this.head = new myStudent(null,null);
        this.last = null;
        this.size = 0;
    }

    //判断Queue是否为null
    public boolean isEmpty(){
        return size==0;
    }
    //判断Queue中的size，即元素个数
    public int size(){
        return size;
    }
}
