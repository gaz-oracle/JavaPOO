package com.gaz.app.collection;

import java.util.*;

public class _LinkedHashSet {
    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();
        names.add("John");
        names.add("Leo");
        names.add("Isa");
        names.add("Mark");
        names.add("Polh");
        names.add("John");

        for (String i:
                names) {
            System.out.println(i);
        }
        System.out.println("****************************");
        // 2.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(3);
        for (Integer i:
                numbers ) {
            System.out.println(i);
        }
        System.out.println("****************************");
        Set<Integer> addNumber = new LinkedHashSet<>();
        addNumber.addAll(numbers);
        for (Integer i:
                addNumber) {
            System.out.println(i);
        }
        // O tambien se puede pasar directamente al constructor:
        System.out.println("****************************");
        Set<Integer> addNumber1 = new LinkedHashSet<>(numbers); // <---
        for (Integer i:
                addNumber) {
            System.out.println(i);
        }
    }
}
/*
1. No mantiene el orden natural de los elementos.
2. Pero si manteine el orden de la inserccion en el cojunto
3. Casi tiene el mismo alto perfomance que el HashSet, pero es mar rapido como el TreeSets
 */