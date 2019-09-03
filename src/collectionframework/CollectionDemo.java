package collectionframework;

import java.util.*;

public class CollectionDemo {
    List<String> list=new ArrayList<>();
    List<String> list1=new ArrayList<>();
    void listData(){
        //String name="rajan,shital,swaraj,priyanka,codekul";
        list.add("rajan");
        list.add("shital");
        list.add("swaraj");
        list.add("priyanka");
        list.add(1,"codekul");
        list.add("rajan");
        list.add("shital");
        list.add("swaraj");
        list.add("priyanka");
        list.add("rajan");
        list.add("shital");
        list.add("swaraj");
        list.add("priyanka");

        list1.add("codekul");
        list1.addAll(list);
/*
        for (String s:list1) {
            System.out.println(s);
        }

        System.out.println("Set Data  :");*/

      setData(list1);
        }

        void setData(List<String> list){

            Set<String> set=new TreeSet<>();
            set.addAll(list);
            for (String s:set) {
                System.out.println(s);
            }

        }


        void setMapData(){

        Map<String,Object> map=new HashMap<>();
        map.put("name","Rajan");
        map.put("address","Pune");
        map.put("mobileNumber","9960448507");
            System.out.println(map.get("mobileNumber"));
        }

    public static void main(String[] args) {
        new CollectionDemo().setMapData();
    }
}
