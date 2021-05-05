package week_9;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUsingArrayList {

    public void iterator(){

    ArrayList nameg = new ArrayList();
    nameg.add(1);
    nameg.add("Arvindbhai");
    nameg.add(2.0);
    nameg.add("Jiubhai");
    nameg.add(3);
    nameg.add("Jayendrabhai");
    nameg.add(4.0);
    nameg.add("Amitbhai");
    nameg.add('P');
    nameg.add('T');

        Iterator sentence = nameg.iterator();
        while(sentence.hasNext()){
            System.out.println(sentence.next());
        }
    }

    public static void main(String[] args) {
        IteratorUsingArrayList obj = new IteratorUsingArrayList();
        obj.iterator();
    }
}
