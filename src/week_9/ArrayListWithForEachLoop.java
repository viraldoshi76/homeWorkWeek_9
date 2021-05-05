package week_9;

import java.util.ArrayList;

public class ArrayListWithForEachLoop {

    public void arrList(){

        ArrayList<String> colour = new ArrayList<String>();
        colour.add("White");
        colour.add("Orange");
        colour.add("Brown");
        colour.add("Red");
        colour.add("Yellow");
        colour.add("Green");
        colour.add("Blue");


        for (String name:colour  ) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ArrayListWithForEachLoop obj = new ArrayListWithForEachLoop();
        obj.arrList();
    }
}
