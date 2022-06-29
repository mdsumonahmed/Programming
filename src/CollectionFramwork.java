import java.util.*;

public class CollectionFramwork {
    public static void main(String[] args) {
        System.out.println("Pactice collection framwork");

        ArrayList <String>l = new ArrayList<String>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("a");
        printArr(l);

        HashMap<Integer,String> mp = new HashMap();
        mp.put(1,"a");
        mp.put(2,"b");
        mp.put(3,"c");
        mp.put(4,"d");
        mp.put(5,"a");
        printMap(mp);
    }

    static void printArr(ArrayList <String> list){
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    static void printMap(HashMap<Integer,String> list){
        for (Map.Entry m: list.entrySet()){
            System.out.println(m.getKey() +" "+m.getValue());
        }
    }
}
