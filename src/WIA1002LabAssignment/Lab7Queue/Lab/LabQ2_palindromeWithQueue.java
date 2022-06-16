package WIA1002LabAssignment.Lab7Queue.Lab;
//Write a Java program that uses a Queue to determine
// if the input string is a palindrome or not.
//输入一个数，判断是不是回文(左右对称)，也就是倒过来读也是一样的，
// 如12321或者123321,ABA，AB2332BA 等等

import java.util.*;

public class
LabQ2_palindromeWithQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            System.out.println(isPalindrome(in.nextLine()));
        }
    }

    //成功同时使用stack & queue判断是否为回文数字
    private static boolean isPalindrome(String str) {
        Stack stack = new Stack();
        Queue queue = new ArrayDeque(50);//容量为50
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            queue.add(chars[i]);//添加进去队列queue
        }
        for (char aChar : chars) {
            stack.push(aChar);//添加进去stack
        }

        String sq ="";
        String ss ="";
        //出队列
        while (!queue.isEmpty()){
            Object str1 = queue.poll();
            sq+=str1;
        }
        //出栈
        while (!stack.isEmpty()){
            Object str2 = stack.pop();
            ss+=str2;
        }

        return sq.equals(ss);
    }
}
