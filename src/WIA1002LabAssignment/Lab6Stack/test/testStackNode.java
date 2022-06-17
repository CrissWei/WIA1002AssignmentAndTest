package WIA1002LabAssignment.Lab6Stack.test;

import WIA1002LabAssignment.Lab6Stack.API.StackNode;
/**
 * @name Wei Zhang
 * @ID S2004131
 * @Date 2022/6/16
 *
 * */

@SuppressWarnings("all") //压制所有的警告
//测试非常正确，所有方法都是我自己独立写的，完全正确，还可以随心所欲添加新的方法
public class testStackNode {
    public static void main(String[] args) {
        StackNode<String> letter = new StackNode<>();
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
        System.out.println(letter.getSize());
        System.out.println(letter.peek());//F 没错
        System.out.println(letter.pop());//删除 F 对了
        System.out.println(letter.isEmpty());
        System.out.println(letter.getSize());
        System.out.println("==========");


        System.out.println(letter.indexOf("A"));//改方法已过时
        System.out.println(letter.indexOf2("A"));
        System.out.println(letter.indexOf2("B"));
        System.out.println(letter.indexOf2("C"));
        System.out.println(letter.indexOf2("D"));
        System.out.println(letter.indexOf2("E"));

        System.out.println("==========");
        System.out.println(letter.search(0));
        System.out.println(letter.search(1));
        System.out.println(letter.search(2));
        System.out.println(letter.search(3));
        System.out.println(letter.search(4));
        System.out.println("==========");


        letter.clear();

        System.out.println(letter.peek());
        System.out.println(letter.pop());
        System.out.println(letter.isEmpty());
        System.out.println(letter.getSize());

        System.out.println("==========");

    }
}
