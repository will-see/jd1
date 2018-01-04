package com.pvt.less_16;

import java.io.Serializable;

/**
 * Created by W510 on 01.01.2018.
 */
public class TouchPad<T> implements Serializable {
    T buttons;

    public TouchPad(T buttons) {
        this.buttons = buttons;
    }
}