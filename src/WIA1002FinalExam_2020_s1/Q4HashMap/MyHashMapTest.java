package WIA1002FinalExam_2020_s1.Q4HashMap;

/**
 * @author Criss (English name)
 *
 * @Name WEI ZHANG
 * @ID  S2004131
 * @Date 2022/6/17
 */

public class MyHashMapTest {
    public static void main(String[] args) {
        System.out.println("========Test MyHashMap API==========");
        MyHashMap<String, String> map = new MyHashMap<>();
        //MyHashMap<Map.Entry<String,String>, String> map = new MyHashMap<>();
        //System.out.println(map.isEmpty());
        System.out.println("run:");

        System.out.println("New directory entry: ");
        map.put("BruceW","011-8998990");
        map.put("DeanW", "017-2274000");
        map.put("TonyS", "019-4550800");
        map.put("LaraC", "014-6402009");
        System.out.println("");

        System.out.println("Get directory: ");
        String e1 = map.getValue("DeanW");
        System.out.println("DeanW: "+ e1);
        String e2 = map.getValue("BruceW");
        System.out.println("BruceW: "+ e2);
        System.out.println("");

        System.out.println("Update directory: ");
        map.put("BruceW","011-5677900");
        map.put("JeanG","019-9001123");

        //Get directory:
        String e3 = map.getValue("BruceW");
        System.out.println("BruceW: "+ e3);
        String e4 = map.getValue("JeanG");
        System.out.println("JeanG: "+ e4);


        System.out.println("=================");
        System.out.println("=================");
        System.out.println(map.isEmpty());
        System.out.println(map.getSize());
        System.out.println("=====display============");
        map.displayAll();
        System.out.println("=====remove============");
        map.remove("JeanG");
        map.remove("BruceW");
        map.remove("XX");
        System.out.println(map.getSize());//5-2=3

        System.out.println("=====display=============");
        map.displayAll();

        System.out.println("===remove has some err=============");
        map.remove(0);
        map.remove(1);
        //map.remove(2);
        System.out.println(map.getSize());//3-2=1

        System.out.println("=====display=============");
        map.displayAll();
        System.out.println("=====remove all============");
        map.removeAll();
        System.out.println("=================");
        System.out.println(map.isEmpty());
        System.out.println(map.getSize());
        System.out.println("=================");
        map.displayAll();//nothing
        System.out.println("=================");
    }
}
