package com.itcast.test;

import java.util.*;

public class test02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"abc","zap","dfp");
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.charAt(1)-o2.charAt(1);
            }
        });
        System.out.println("修改了");
        System.out.println(list);

    }
}
