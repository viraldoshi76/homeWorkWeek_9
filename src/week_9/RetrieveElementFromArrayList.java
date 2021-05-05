package week_9;

import java.util.ArrayList;

public class RetrieveElementFromArrayList {

    public void retrieve(){

        ArrayList food = new ArrayList();
        food.add("Pizza");
        food.add("Khaman");
        food.add("Dabeli");
        food.add("Sevusal");
        food.add("pav bhaji");
        food.add("Samosa");

        System.out.println(food.get(4));
    }

    public static void main(String[] args) {
        RetrieveElementFromArrayList obj = new RetrieveElementFromArrayList();
        obj.retrieve();

    }
}
