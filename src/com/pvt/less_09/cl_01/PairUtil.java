package com.pvt.less_09.cl_01;

/**
 * Created by W510 on 18.12.2017.
 */
public final class PairUtil {
//    public static swap <K,V> Pair<K,V> ;{
//        return Pair(V,K);
//    }

    public static final <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getValue(), pair.getKey());
    }
}
