package WIA1002LabAssignment.Lab7Queue.Lab;
//Write a Java program that uses a Queue to determine
// if the input string is a palindrome or not.
//输入一个数，判断是不是回文(左右对称)，也就是倒过来读也是一样的，
// 如12321或者123321,ABA，AB2332BA 等等
import java.util.Scanner;
import java.util.Stack;

public class
LabQ2_palindromeWithStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            System.out.println(isPalindrome(in.nextLine()));
        }

    }

    //成功使用stack判断是否为回文数字(没必要使用Queue，多余)
    private static boolean isPalindrome(String str) {
        Stack stack = new Stack();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            stack.push(aChar);//添加进去stack
        }
        String ss ="";
        //出栈
        while (!stack.isEmpty()){
            Object str2 = stack.pop();
            ss+=str2;
        }
        return str.equals(ss);
    }
}
