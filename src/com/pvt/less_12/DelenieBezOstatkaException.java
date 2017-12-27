package com.pvt.less_12;

/**
 * Created by W510 on 26.12.2017.
 */
public class DelenieBezOstatkaException extends Exception {
    private Exception _myException;
    public DelenieBezOstatkaException(String er, Exception e){
        super(er);
        _myException = e;
    }
    public DelenieBezOstatkaException(String er) {
        super(er);
    }
    public Exception getHiddenException() {
        return (_myException);
    }
}

