package com.pvt.less_09.cl_05;

/**
 * Created by W510 on 18.12.2017.
 */
public class TestTransaction {

    public void start() {
        System.out.println("Transaction is started");
        doSmth();
        stop();
    }

    private void stop() {
        System.out.println("Transaction is stoped");
    }

    @Transaction
    private void doSmth() {
        TrasactionAnalyzer.analyze(this.getClass());
    }
}
