package WIA1002LabAssignment.Lab9Recursion.Tutorial9;
/*
* 4. Write a recursive method to calculate the following :
5 + 4 + 3 + 2 + 1.
 State the base case and recursive case.
 * Trace your solution using number, N of 5.
        Algorithm :
        1. Base case = 1
        2. Recursive case = n + sum(n-1)

* */
public class Q4 {
    public static void main(String[] args) {
        System.out.println(getSum(4));//10
        System.out.println(getSum(5));//15
        System.out.println(getSum(6));//21
    }
    private static int getSum(int n) {
        if (n==1) return 1;
        if (n==2) return 3;
        if (n==3) return 6;
        else {
            return n+getSum(n-1);
        }
    }
}
