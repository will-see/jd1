package com.pvt.less_15;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by W510 on 29.12.2017.
 */
public class Cl_06 {
    public static void main(String[] args) {
        File startDir = new File("c:\\Users\\W510\\Desktop\\PVT_project\\src\\com\\pvt");
        checkDir(startDir);
        }

    private static void checkDir(File startDir) {
        File[] arrFiles = startDir.listFiles();
        for (File f : arrFiles) {
            if(f.isDirectory()) {
                checkDir(f);
                System.out.println(f.toString());
            }else {
                System.out.println(f.toString());
            }
        }

    }
}