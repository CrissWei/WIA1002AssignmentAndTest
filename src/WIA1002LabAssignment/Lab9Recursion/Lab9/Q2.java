package WIA1002LabAssignment.Lab9Recursion.Lab9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
* 2. Write a recursive method called permuteString() that will
print all the possibilities to arrange the letters of the given word.
打印出所有的排列组合情况
Input :
ABC

Output:
ABC
ACB
BAC
BCA
CAB
CBA
* */
public class Q2 {
        public static void main(String[] args) {
            String[] array = new String[] {"1", "2", "3", "4"};
            arrangeAll(Arrays.asList(array), "");
        }

        public static void arrangeAll(List array, String prefix){
            System.out.println(prefix);
            for (int i = 0; i < array.size(); i++) {
                List temp = new LinkedList(array);
                //递归调用
                arrangeAll(temp, prefix + temp.remove(i));
            }
        }
}
