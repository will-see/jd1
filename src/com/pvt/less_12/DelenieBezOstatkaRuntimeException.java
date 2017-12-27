package com.pvt.less_12;

/**
 * Created by W510 on 26.12.2017.
 */
public class DelenieBezOstatkaRuntimeException extends RuntimeException {
    private Exception _myException;
    public DelenieBezOstatkaRuntimeException(String er, Exception e){
        super(er);
        _myException = e;
    }
    public DelenieBezOstatkaRuntimeException(String er) {
        super(er);
    }
    public Exception getHiddenException() {
        return (_myException);
    }
}

