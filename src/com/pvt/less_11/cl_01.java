package com.pvt.less_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by W510 on 20.12.2017.
 */
public class cl_01 {
    public static void main(String[] args) {
        List<Integer> list =  Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUnique(list));
    }

    private static int countUnique(List<Integer> list) {
        ArrayList<Integer>uniqueList = new ArrayList<>();
        for (int i=0;i<list.size();i++) {
            if(!uniqueList.contains(list.get(i))){
                uniqueList.add(list.get(i));
            }
        }
        return uniqueList.size();
    }
}
