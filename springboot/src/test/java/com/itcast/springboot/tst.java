package com.itcast.springboot;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class tst {
    public static void main(String[] args) {
        Map<String,String>map = new HashMap<String, String>();
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            String key = stringStringEntry.getKey();
            String value = stringStringEntry.getValue();

        }
        for (String s : map.keySet()) {
            System.out.println(s);

        }
        for (String s : map.values()) {
            System.out.println(s);
        }
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+next.getValue());
        }
    }

}
