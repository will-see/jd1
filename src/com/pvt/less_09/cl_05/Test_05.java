package com.pvt.less_09.cl_05;

/**
 * Created by W510 on 18.12.2017.
 * 5.	Задание Аннотации. Реализовать аннотацию Transaction и анализатор данной транзакции. Смысл данной аннотации заключается в том, что если метод помечен данной аннотацией, значит он вызывается в рамках транзакции. В рамках транзакции - когда выводится на консоль два сообщения: “Transaction is started”; “Transaction is ended”.
 */
public class Test_05 {
    public static void main(String[] args) {
        TestTransaction transaction = new TestTransaction();
        transaction.start();
    }

}
