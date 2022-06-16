package WIA1002LabTest.S2004131WEIZHANG;

import java.io.FileInputStream;
import java.io.IOException;

public class Queue_Q1 {
    //throws IOException
    public static void main(String[] args) throws IOException {
        String files = "";
        // this is for read files from the MyLinkedListTest.xml
        FileInputStream fis = new FileInputStream("L:\\IdeaProjects\\Algorithm_1\\src\\WIA1002\\S2004131WEIZHANG\\labtest2.txt");
        byte[] bys = new byte[1024];
        int len;
        //output the files
        while ((len = fis.read(bys)) != -1) {
            files = new String(bys, 0, len);
            //System.out.println(files);
        }
        //create a ArrayDeque Object
        Q1Queue<String> aq = new Q1Queue<>();
        //Product Code in Queue : P03 -->P02 --> P06 -->P04 -->
        System.out.println("Product Code in Queue : P03 -->P02 --> P06 -->P04 -->");
        // List of product by categories
        System.out.println("List of product by categories");
        System.out.println("Product : P03");

        if (files.contains("P03")) {
            aq.enqueue("Durian");
            aq.enqueue("Tembikai");
            aq.enqueue("Mangga");
            aq.enqueue("Rambutan");

            System.out.print(aq.dequeue() + "-->");
            System.out.print(aq.dequeue() + "-->");
            System.out.print(aq.dequeue() + "-->");
            System.out.print(aq.dequeue() + "-->");

            System.out.println();
        }
        System.out.println("Product : P02");
        if (files.contains("PO2")) {
            aq.enqueue("iPhone");
            aq.enqueue("Samsung");
            aq.enqueue("Nokia");

            System.out.print(aq.dequeue() + "-->");
            System.out.print(aq.dequeue() + "-->");
            System.out.print(aq.dequeue() + "-->");

            System.out.println();
        }

        System.out.println("Product : P06");
        if (files.contains("P06")) {
            aq.enqueue("Buku");
            aq.enqueue("Pembaris");
            aq.enqueue("Kertas");

            System.out.print(aq.dequeue() + "-->");
            System.out.print(aq.dequeue() + "-->");
            System.out.print(aq.dequeue() + "-->");

            System.out.println();
        }

        System.out.println("Product : P04");
        if (files.contains("P04")) {
            aq.enqueue("Baju");
            aq.enqueue("Kasut");

            System.out.print(aq.dequeue() + "-->");
            System.out.print(aq.dequeue() + "-->");

            System.out.println();
        }

    }
}
