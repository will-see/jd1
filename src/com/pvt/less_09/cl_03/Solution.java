package com.pvt.less_09.cl_03;

/**
 * Created by W510 on 18.12.2017.
 * 3.	Дан класс Solution, параметризированный T. Ограничьте параметр T.
 T должен быть наследником класса ClassForGenerics и одновременно реализовывать интерфейс InterfaceForGenerics. Менять можно только класс Solution.

 */
public class Solution <T extends ClassForGenerics & InterfaceForGenerics> {
}
