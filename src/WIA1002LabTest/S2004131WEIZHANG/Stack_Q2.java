package WIA1002LabTest.S2004131WEIZHANG;

import java.io.FileInputStream;
import java.io.IOException;



public class Stack_Q2 {
    public static void main(String[] args) throws IOException {
        //FileInputStream fis = new FileInputStream("L:\\IdeaProjects\\Algorithm_1\\src\\MyLinkedListTest.xml");
        // this is for read files from the MyLinkedListTest.xml
        FileInputStream fis = new FileInputStream("L:\\IdeaProjects\\Algorithm_1\\src\\WIA1002\\S2004131WEIZHANG\\MyLinkedListTest.xml");
        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            //System.out.println(new String(bys,0,len));
            System.out.println(isHTMLMatched(new String(bys,0,len)));
        }
    }

    public static boolean isHTMLMatched(String html) {
        Q2Stack buffer = new Q2Stack();
        int j = html.indexOf('<'); // find first ’<’ character (if any)
        while (j != -1) {
            int k = html.indexOf('>', j+1); // find next ’>’ character
            if (k == -1)
                return false; // invalid tag
            String tag = html.substring(j+1, k); // strip away < >
            if (!tag.startsWith("/")) // this is an opening tag
                buffer.push(tag);
            else { // this is a closing tag
                if (buffer.isEmpty( ))
                    return false; // no tag to match
                if (!tag.substring(1).equals(buffer.pop( )))
                    return false; // mismatched tag
            }
            j = html.indexOf('<', k+1); // find next ’<’ character (if any)
        }
        return buffer.isEmpty( ); // were all opening tags matched?
    }

}
