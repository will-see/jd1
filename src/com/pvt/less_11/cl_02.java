package com.pvt.less_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by W510 on 20.12.2017.
 */
public class cl_02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");
        map.put("e", "e");

        System.out.println(isUnique(map));


    }

    private static boolean isUnique(Map<String, String> map) {
        String mapValue = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int countValue = 0;
            mapValue = entry.getValue();

            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                if (mapValue.equals(entry2.getValue())) {
                    countValue++;
                    if(countValue>1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
