package WIA1002FinalExam_2020_s1.Q1Stack;

//测试非常正确，所有方法都是我自己独立写的，完全正确，还可以随心所欲添加新的方法
public class StackNodeTest {
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
        System.out.println(letter.indexOf2("A"));
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
}
