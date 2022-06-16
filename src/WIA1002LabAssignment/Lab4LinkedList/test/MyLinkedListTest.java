package WIA1002LabAssignment.Lab4LinkedList.test;

import WIA1002LabAssignment.Lab4LinkedList.ITheiMa.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3,399);// insert有问题， 修好了
        // 1->2->3->399->4
      /*  System.out.println("遍历链表：");
        while (list.hasNext()){
            System.out.println(list.next());
        }
        System.out.println();*/

        System.out.println(list.indexOf(1));
        System.out.println(list.indexOf(2));//
        System.out.println(list.indexOf(299));//-1
        System.out.println(list.length());
        System.out.println();

        System.out.println(list.remove(1));//2正确
        System.out.println(list.remove(2));//399正确,因为前面的已经被删了
        System.out.println(list.remove(2));//4正确
        System.out.println(list.remove(2));//null
        System.out.println(list.length());//2
        System.out.println();//还剩2个元素：1->3

        System.out.println(list.indexOf2(1));//0
        System.out.println(list.indexOf2(2));//-1
        System.out.println(list.indexOf2(3));//1
        System.out.println();

        System.out.println(list.isEmpty());
        System.out.println(list.length());
        System.out.println();

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(10));//null
        System.out.println();

        System.out.println("插入i处元素");
        list.add(1,111);
        //list.insert(40,4099);
        System.out.println(list.get(1));
        System.out.println(list.length());
        System.out.println("====");


        list.add(11);
        list.add(22);
        list.add(33);
        System.out.println("遍历链表：");
        while (list.hasNext()){
            System.out.println(list.next());
        }
        System.out.println();
        list.clear();
        System.out.println(list.isEmpty());

    }
}
