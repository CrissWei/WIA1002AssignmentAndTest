package WIA1003LabAssignment;
import java.util.Arrays;
import java.util.Scanner;

/*
* 1. Write a program with indexed addressing
* that calculates the sum of all the gaps between array elements.
* The array elements are word type, sequenced in non-decreasing order.
* Use the value array {0,2,5,9,10}.  非降序，那就升序排列
* These values has a gaps of 2,3,4, and 1 which the total of 10.
* 2+3+4+1=10
*
* */
public class Q1 {
    public static void main(String[] args) {
        int[]arr={0,2,5,9,10};
        System.out.println("The sum of gaps: "+getGapSum(arr));

        //下面是可以动输入数字计算间隔
        int[]array =new int[100];
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();//输入一个数，代表将要输入的个数
            for (int i = 0; i < num; i++) {
               array[i]=in.nextInt();//把键盘输入的数字，赋值给数组array，最多100个
            }
            System.out.println("The sum of gaps: "+getGapSum(array));
        }
    }

    private static int getGapSum(int[]arr) {
        Arrays.sort(arr);
        int sum =0;
        int[] newArray= new int[arr.length]; //间隔=长度-1
        for (int i = 0; i < arr.length-1; i++) {
            //涉及到这种怎么解？ 跟华为第一题差不多也是这样
            //【终于找到原因why，i < arr.length-1;而不是i < arr.length;】
                newArray[i]=arr[i+1]-arr[i];
            //System.out.println(newArray[i]);//成功执行
            sum+=newArray[i];
        }
        return sum;
    }
}
