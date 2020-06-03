package com.codewithmosh;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Date now = new Date();
        Long time = now.getTime();
        int hours = now.getHours();
        System.out.println(hours + ":" + now.getMinutes());

        Point point1 = new Point(1,1);

    }
}
