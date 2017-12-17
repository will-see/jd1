package com.pvt.less_08;

/**
 * Created by W510 on 13.12.2017.
 */
public abstract class Shape  implements  CalculateSquare {

    @Override
    public double calcSquare() {
        return 0;
    }
    public boolean isAreaEquals(Shape shape){
        if (this.calcSquare()==shape.calcSquare()){
            return true;
        } else return false;
    }
}
