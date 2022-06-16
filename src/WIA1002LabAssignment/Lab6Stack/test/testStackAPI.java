package WIA1002LabAssignment.Lab6Stack.test;

import WIA1002LabAssignment.Lab6Stack.API.StackAPI;

import java.util.Scanner;

public class testStackAPI<E> {
    public static void main(String[] args) {
        StackAPI<Object> s = new StackAPI<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int a = sc.nextInt();


        for(int i=1; i<=a; i++){
            s.push(i);
        }
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.empty());

        System.out.println(s.search(1));
        System.out.println(s.search("6"));
        System.out.println(s.search(3));
        System.out.println("=====");

        System.out.println(s);
        System.out.println("The size of the stack is " + s.getSize());
        System.out.println("The element inside the stack is : ");
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println(s.empty());

    }
}
