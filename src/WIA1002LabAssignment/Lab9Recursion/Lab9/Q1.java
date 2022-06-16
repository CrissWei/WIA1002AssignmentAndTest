package WIA1002LabAssignment.Lab9Recursion.Lab9;
/*
Create a recursive function that accepts a String parameter,
and substitute any of the lowercase “a” (no applicable for uppercase "A")
found with “i” char. Example:
substituteAI ("flabbergasted ") → "flibbergisted "
substituteAI ("Astronaut ") → " Astroniut"
意思就是把小写字母a替换成i
* */
public class Q1 {
    public static void main(String[] args) {
        replaceA("flabbergasted");
        replaceA("Astronaut");
        System.out.println("==========");
        //////////////
        replaceA2("flabbergasted");
        replaceA2("Astronaut");
        System.out.println("=======");
        System.out.println(substituteAI("flabbergasted"));
        System.out.println(substituteAI("Astronaut"));
    }

    private static void replaceA2(String str) {
        String ss="";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='a'){
                chars[i]='i'; //把i赋值给chars[i]
            }
            ss+=chars[i];
        }
        System.out.println(ss);
    }

    private static void replaceA(String str) {
        String s = str.replaceAll("a", "i");
        System.out.println(s);
    }



    public static String substituteAI(String str){
        if(str.isEmpty()) return str;
        else if(str.charAt(0) == 'a'){
            return 'i' + substituteAI(str.substring(1));}
        else {
            return str.charAt(0) + substituteAI(str.substring(1));
        }
    }
}
