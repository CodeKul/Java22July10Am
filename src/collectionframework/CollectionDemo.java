package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

    void listData(){
        String name="rajan,shital,swaraj,priyanka,codekul";

        List<String> list=new ArrayList<>();

        list.add(name);

        /*list.add("Rajan");
        list.add("shital");
        list.add("swaraj");
        list.add("priyanka");
        list.add(1,"codekul");
*/
        for (String s:list) {
            System.out.println(s);
        }
        }


    public static void main(String[] args) {
        new CollectionDemo().listData();
    }
}
