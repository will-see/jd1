package com.pvt.less_04.cl_01_time;

/**
 * Created by W510 on 01.12.2017.
 * Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
 * Создать метод для получения полного количества секунд в объекте
 * Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных.
 * Написать программу для тестирования возможностей класса.
 */
public class TimeRange {
    int hours;
    int minutes;
    int seconds;
    int fullSeconds;

    {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public TimeRange(int fullSeconds) {
        this.fullSeconds = fullSeconds;
    }

    public TimeRange(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        parseToSeconds(hours, minutes, seconds);
    }

    public void parseToSeconds(int hours, int minutes, int seconds) {
        int fullSeconds = 0;
        fullSeconds += seconds + minutes*60 + hours*3600;
        this.fullSeconds = fullSeconds;
    }

    public void print() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
        System.out.println("Всего " + fullSeconds + " секунд");
    }
}
