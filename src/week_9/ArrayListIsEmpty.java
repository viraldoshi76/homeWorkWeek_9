package week_9;

import java.util.ArrayList;

public class ArrayListIsEmpty {

    public void empty(){

        ArrayList tubenames = new ArrayList();
        tubenames.add("bakerloo");
        tubenames.add("picadilly circus");
        tubenames.add("central line");
        tubenames.add("District");
        tubenames.add("Jubilee");
        tubenames.add("Victoria");
        tubenames.add("Northern");

        System.out.println(tubenames.isEmpty());

    }

    public static void main(String[] args) {
        ArrayListIsEmpty obj = new ArrayListIsEmpty();
        obj.empty();

    }
}
