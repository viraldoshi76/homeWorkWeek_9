package week_9;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithForEachLoop {

    public void hashMapForEach(){

        Map <Integer,String> people = new HashMap<>();
        people.put(1,"Amirkhan");
        people.put(2,"Amitabh");
        people.put(3,"Dilipkumar");
        people.put(4,"Manojkumar");
        people.put(5,"Rajkapoor");
        people.put(6,"Akshaykumar");

        for (int  value: people.keySet()) {
            System.out.println(value + "  "+people.get(value));
            
        }
    }

    public static void main(String[] args) {
        HashMapWithForEachLoop obj = new HashMapWithForEachLoop();
        obj.hashMapForEach();
    }
}
