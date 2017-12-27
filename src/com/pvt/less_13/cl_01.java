package com.pvt.less_13;

/**
 * Created by W510 on 27.12.2017.
 */
public class cl_01 {
    public static void main(String[] args) {
        String s ="";
        long timeStartString = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<1000; i++){
            s+="a";
        }
        long timeStopString = System.currentTimeMillis();
        long timeString = timeStopString-timeStartString;

        long timeStartSB = System.currentTimeMillis();
        for (int i=0; i<1000; i++){
            sb.append("a");
        }
        long timeStopSB = System.currentTimeMillis();
        long timeSB = timeStopSB-timeStartSB;
        System.out.println("String " + timeString);
        System.out.println("SB " + timeSB);
    }
}
