package WIA1002LabAssignment.Lab7Queue.Lab;
//Write a Java program that uses a Queue to determine
// if the input string is a palindrome or not.
//输入一个数，判断是不是回文(左右对称)，也就是倒过来读也是一样的，
// 如12321或者123321,ABA，AB2332BA 等等

import java.util.Scanner;

public class LabQ2_palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            System.out.println(isPalindrome(in.nextLine()));
        }
    }

    private static boolean isPalindrome(String str) {
        String s = new StringBuilder(str).reverse().toString();
        return s.equals(str);
//        if (s.equals(str)){
//            return true;
//        }
//        return false;
    }
}
