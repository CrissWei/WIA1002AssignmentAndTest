package WIA1002LabAssignment.Lab9Recursion.Lab9;
/*
*求x的y次幂, 如10的3次幂是：10*10*10=1000
 Example:
exponent(10,3) → will produce an output of 1000
* */
public class Q3 {
    public static void main(String[] args) {
        System.out.println( exponent(2,5));
        System.out.println( exponent(3,3));
    }
    public static long exponent(int x, int y){
        if(y==0) return 1;
        //else return x*exponent(x,y-1);
        else return x*exponent(x,--y);
    }
}
