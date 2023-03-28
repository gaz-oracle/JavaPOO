package com.gaz.app.hasmap;

import java.util.HashMap;
import java.util.Map;

public class UserHashMap {

    public static void main(String[] args) {

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,new Student("Fco", "Gaz"));
        studentMap.put(2,new Student("John", "Doe"));
        studentMap.put(3,new Student("Tony", "Stark"));

        studentMap.forEach((K,V) -> {
            System.out.println("[Key]:" + K + " / " +"[Value]:" + V);
        });
    }
}
