package WIA1003LabAssignment;

import java.util.Scanner;

/*
* 4. Create a procedure that receives an integer value between 0 and 100.
* Then, display a single capital letter on the screen.
The letter returned by the procedure should be according to the following ranges.
90 to 100 ---- A
80 to 89 ------ B
70 to 79 ------ C
60 to 69 ------ D
0 to 59 -------- F
*
* 或者用一个switch啊
* */
public class Q4 {
    public static void main(String[] args) {
        getABC();
    }

    private static void getABC() {
        System.out.print("Enter marks (0-100): ");
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            if (num >= 90 && num <= 100) {
                System.out.println("Grade: A");
                System.out.print("Enter marks (0-100): ");
                //break;
            } else if (num >= 80 && num < 90) {
                System.out.println("Grade: B");
                System.out.print("Enter marks (0-100): ");
                //break;
            } else if (num >= 70 && num < 80) {
                System.out.println("Grade: C");
                System.out.print("Enter marks (0-100): ");
                //break;
            } else if (num >= 60 && num < 70) {
                System.out.println("Grade: D");
                System.out.print("Enter marks (0-100): ");
                //break;
            } else {
                System.out.println("Grade: F");
                System.out.print("Enter marks (0-100): ");
            }
        }
    }
}
