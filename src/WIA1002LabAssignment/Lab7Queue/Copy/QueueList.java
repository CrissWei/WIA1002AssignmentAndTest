package WIA1002LabAssignment.Lab7Queue.Copy;

    class Element<T> {
        private T value;//链表值
        private Element<T> next;//指针

        public void setNext(Element<T> next) {
            this.next = next;
        }
        public Element<T> getNext(){
            return  next;
        }

        public void setValue(T value) {
            this.value = value;
        }
        public  T getValue(){
            return value;
        }
    }


    public class QueueList<T>{

        private  Element<T> first=null; //链表头
        private  Element<T> last=null; //链表尾
        private int size=0; //链表长度


        public boolean pushBack(T newElement) {
            Element<T> element=new Element<>();
            element.setValue(newElement);
            if(size==0) {
                first=element;
                size++;
                return  true;
            }
            if(last==null){
                last=element;
                first.setNext(last);
            }else {
                last.setNext(element);
                last=element;
            }
            size++;
            return true;
        }


        public Element<T> popFront() {
            if(first==null){
                return  null;
            }else {
                Element<T> result=first;
                first=first.getNext();
                return  result;
            }
        }


        public int size() {
            return size;
        }


        public Element front() {
            return first;
        }


}
