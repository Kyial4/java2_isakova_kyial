package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> color= new ArrayList<>(3);
        color.add("Red");
        color.add("Green");
        color.add("Black");
        color.ensureCapacity(6);
        color.add("White");
        color.add("Pink");
        System.out.println(color);
        Collections.reverse(color);
        System.out.println(color);
        Collections.shuffle(color);
        System.out.println(color);
    }
}
