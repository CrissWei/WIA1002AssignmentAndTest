package WIA1002LabAssignment.Lab4LinkedList.test;

import WIA1002LabAssignment.Lab4LinkedList.ITheiMa.Node;

public class testNode {
    public static void main(String[] args) {
        //创建互相独立的节点
        Node<Integer> first = new Node<Integer>(11,null);
        Node<Integer> second = new Node<Integer>(22,null);
        Node<Integer> third = new Node<Integer>(33,null);
        Node<Integer> four = new Node<Integer>(44,null);
        Node<Integer> five = new Node<Integer>(55,null);

        //组织节点，成为链表
        first.next=second; //第1个的next指针,指向了节点指向第2个节点
        second.next=third;
        third.next=four;
        four.next=five;
        System.out.println(first.next);//Node@776ec8df 是地址值
        System.out.println(second.next);//Node@4eec7777
        System.out.println(five.next);//null
        System.out.println("===========");

        System.out.println(first.item);//11
        System.out.println(first.next.item);//22
        System.out.println(second.item);//22
        System.out.println(first.next.next.item);//33
        System.out.println(first.next.next.next.item);//44
        System.out.println(first.next.next.next.next.item);//55

        System.out.println("===============");
        System.out.println(four.item);//44
        System.out.println(five.item);//55
        System.out.println(five.next);//null

    }
}
