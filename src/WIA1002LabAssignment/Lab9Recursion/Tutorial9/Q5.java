package WIA1002LabAssignment.Lab9Recursion.Tutorial9;

import java.lang.reflect.Array;

/*
* 5. Write a recursive method printDigit
* that prints an integer argument as its constituent digits,
with a blank space separates each digit with the next.
* For example,
* input:    4567
  output:   4 5 6 7
* */
public class Q5 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10};
        BlankSpace(arr);
        System.out.println();
        //////////////
        BlankSpace2(12345);
    }

    private static void BlankSpace2(int num) {
        if(num == 0){
            return ;
        }
        BlankSpace2(num/10);
        System.out.print(num%10 + " ");
    }

    private static void BlankSpace(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
