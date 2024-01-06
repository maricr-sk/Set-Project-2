package com.example.setproject;
import javafx.util.Pair;
import java.util.*;

public class SetProject {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 3);
        map.put("B", 4);
        map.put("C", 3);
        map.put("D", 6);
        map.put("G", 7);
        map.put("G", 8);
        map.put("G", 9);

        System.out.println(map);

        Set<Map.Entry<String, Integer>> es = map.entrySet();
        System.out.println(map);

        Iterator<Map.Entry<String, Integer>> it = es.iterator();
        Map.Entry entry = it.next();
        it.remove();

        System.out.println(es);
        //use an iterator to delete or else program will crash
    }












    public static void hold(String [] args){
        Pair<Integer, Integer> pt1 = new Pair<Integer, Integer>(3,2);
        Pair<Integer, Integer> pt2 = new Pair<Integer, Integer>(3,4);
        Pair<Integer, Integer> pt3 = new Pair<Integer, Integer>(7,5);

        List<Pair<Integer, Integer>> coordinates = new ArrayList<>();
        coordinates.add(pt1);
        coordinates.add(pt2);
        coordinates.add(pt3);

        for(Pair<Integer, Integer> item : coordinates){
            System.out.println("(" + item.getKey() + " , " + item.getValue() + ")");
        }

        Set<Pair<Integer, Integer>> set = new HashSet<>();
        set.add( new Pair<Integer, Integer>(3,4));
        set.add( new Pair<Integer, Integer>(2,3));
        set.add( new Pair<Integer, Integer>(7,9));
        set.add( new Pair<Integer, Integer>(2,11));
        set.add( new Pair<Integer, Integer>(9,9));
        set.add( new Pair<Integer, Integer>(5,7));
        set.add( new Pair<Integer, Integer>(1,0));
        set.add( new Pair<Integer, Integer>(0,0));
        set.add( new Pair<Integer, Integer>(0,9));

        Iterator<Pair<Integer,Integer>> it = set.iterator();
        System.out.println(set);

        while(it.hasNext()){
            Pair<Integer, Integer> bing = it.next();
            if ((bing.getKey() % 2 == 1) && (bing.getValue() % 2 == 1)){
                it.remove();
            }
        }
        System.out.println(set);

        /*
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            if(map.get(key) % 2 ==1 ){
                it.remove();
            }
        }
        System.out.println(map);

        Set<Integer> values = new HashSet<Integer>(map.values());
        Iterator<Integer> bit = values.iterator();
        while(it.hasNext()){
            Integer val = bit.next();
            System.out.println(val);
         */

    }
}
