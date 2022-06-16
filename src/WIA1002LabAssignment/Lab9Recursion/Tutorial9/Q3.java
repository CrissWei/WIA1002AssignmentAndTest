package WIA1002LabAssignment.Lab9Recursion.Tutorial9;

public class Q3 {
    public static void main(String[] args) {
        //System.out.println(f(1));
        reverse("zhangwei");
    }
    public static int f(int n) {
        if (n == 1)
            return n;
        else
            return n * f(n-1);
    }

    //Write a recursive method to reverse a string,like:String → gnirts
    public static void reverse(String str) {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
}
