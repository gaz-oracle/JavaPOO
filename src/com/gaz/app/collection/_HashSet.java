package com.gaz.app.collection;

import java.util.*;

public class _HashSet {
    public static void main(String[] args) {

       Set<String> names = new HashSet<>();
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
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(3);
        for (Integer i:
            numbers ) {
            System.out.println(i);
        }
        System.out.println("****************************");
        Set<Integer> addNumber = new HashSet<>();
        addNumber.addAll(numbers);
        for (Integer i:
             addNumber) {
            System.out.println(i);
        }
        // O tambien se puede pasar directamente al constructor:
        System.out.println("****************************");
        Set<Integer> addNumber1 = new HashSet<>(numbers); // <---
        for (Integer i:
                addNumber) {
            System.out.println(i);
        }
    }
}

/*
1. el conjunto NO contiene elementso repetidos.
2. Una arrayList (o Lista), se puede asignar a un pra quitar elementos repetidos.
3. No se garantiza que los objetos que inserte en HashSet se inserten en el mismo orden.
    Los objetos se insertan en función de su código hash.
4. Se permiten elementos NULL en HashSet
5. HashSet también implementa interfaces serializables y clonables
6. Cuando usar hash? puede ser cuando el orden de los elementos no importe y cuando no se quiera tener
   elementos repetidos.
7.Almacenamiento en HashMap: En realidad, el valor que insertamos en HashSet actúa como una clave
  para el objeto del mapa y para su valor, Java usa una variable constante.
   Entonces, en el par clave-valor, todos los valores serán iguales.
8. Tiene an alto perfomance en sus operaciones
9. La Implentaccin TreeSet "casi lo mismo", solo que ordena los elementos..pero tiene un bajo Perfomance..ver main 3
10. HashSet son las mas usados en la vida real.c
 */


