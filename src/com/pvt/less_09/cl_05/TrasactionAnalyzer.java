package com.pvt.less_09.cl_05;

import java.lang.reflect.Method;

/**
 * Created by W510 on 18.12.2017.
 */
public class TrasactionAnalyzer {
    static void analyze(Class cl) {
        Method[] method = cl.getMethods();
        for (Method md : method) {
            if (md.isAnnotationPresent(Transaction.class)) {
                System.out.println(md.getName());
                break;
            }
        }
    }
}
