package com.pvt.less_10;

import java.util.*;

/**
 * Created by W510 on 19.12.2017.
 */
public class cl_06 {
    public static void main(String[] args) {
        String s = "Мама мыла раму мама мылом раму мыла.";
        ArrayList<String> text = new ArrayList<>(Arrays.asList(s.split("[\\s,.!?]+")));
        System.out.println(text);
        Set<String> words = new HashSet<>();
        for (int i=0; i<text.size(); i++) {
            text.set(i,text.get(i).toLowerCase());
            words.add(text.get(i));
    }
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            int count = Collections.frequency(text, word);
            System.out.println(word + " " + count);
        }
    }
}
