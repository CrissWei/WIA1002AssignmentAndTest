package WIA1003LabAssignment;

import java.util.Scanner;

/*
* 打印
1 2 3 4 5 6 7 8
2 3 4 5 6 7 8
3 4 5 6 7 8
4 5 6 7 8
5 6 7 8
6 7 8
7 8
8
* */
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            getSan(in.nextInt());
        }
    }

    //第二个for里面的数值，我是多次尝试，慢慢地调试出来的
    private static void getSan(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i+" ");
            for (int j = i+1; j <= num; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
