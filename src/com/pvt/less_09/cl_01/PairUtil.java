package com.pvt.less_09.cl_01;

/**
 * Created by W510 on 18.12.2017.
 * 2.	Создать статический обобщённый метод swap в final классе PairUtil. Метод должен принимать объект класса Pair и возвращать пару, в которой элементы поменяны местами.  *
 */
public final class PairUtil {

    public static final <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getValue(), pair.getKey());
    }
}
