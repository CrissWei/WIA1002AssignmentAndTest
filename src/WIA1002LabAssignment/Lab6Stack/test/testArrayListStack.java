package WIA1002LabAssignment.Lab6Stack.test;

import WIA1002LabAssignment.Lab6Stack.API.ArrayListStack;

import java.util.Scanner;

public class testArrayListStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int a = sc.nextInt();
        ArrayListStack<Integer> s = new ArrayListStack();

        for(int i=1; i<=a; i++){
            s.push(i);
        }
        System.out.println(s.search(1));
        System.out.println(s.search(2));
        System.out.println(s.search(3));
        System.out.println("=====");

        System.out.println(s);
        System.out.println("The size of the stack is " + s.getSize());
        System.out.println("The element inside the stack is : ");
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

}
