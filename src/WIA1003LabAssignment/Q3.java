package WIA1003LabAssignment;

import java.util.Scanner;

/*
* 3. Write a program that prompts the user
for three 32-bit integers stores them in an array,
calculates the sum of the array, and displays the sum on the screen.*/
public class Q3 {
    public static void main(String[] args) {
//        System.out.println(getSum(45,56,67));// 1+2+3=6
//        System.out.println("==========");

        int[] arr = new int[100];
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you want to input? : ");

        while (in.hasNext()){
            int num = in.nextInt();//输入一个数，代表数组内元素的个数
            for (int i = 0; i < num; i++) {
                System.out.print("Enter 32-bit integer is : ");
                arr[i] = in.nextInt();//把每一个数字赋值给数组
            }
            System.out.print("The sum of 32-bit integer is : + ");
            System.out.println(getSum(arr));
        }
    }

    private static int getSum(int a ,int b,int c) {
        return a+b+c;
    }

    //数组内all元素之和
    private static int getSum(int []arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
