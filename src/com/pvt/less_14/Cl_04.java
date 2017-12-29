package com.pvt.less_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by W510 on 29.12.2017.
 * 4. Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
 * и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
 * X - код оператора
 * Y - номер телефона
 */
public class Cl_04 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\+375[0-9]{9}\\b");
        String s = "tel1 +375291111111 tel2 +375292222222 tel3 +375333333333444";
        System.out.println(s);
        Matcher matcher = p.matcher(s);
        while (matcher.find()) {
            String phone = matcher.group();
            StringBuilder newPhone = new StringBuilder();
            newPhone.append(phone.substring(0, 4)).append(" (").append(phone.substring(4, 6)).append(") ").append(phone.substring(6, 9)).append("-").append(phone.substring(9, 11)).append("-").append(phone.substring(11, 13));
            s = s.replace(phone, newPhone);
        }
        System.out.println(s);
    }
}
