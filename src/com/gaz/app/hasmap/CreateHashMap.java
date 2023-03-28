package com.gaz.app.hasmap;

import java.util.*;

//28-03-23 17:16
public class CreateHashMap {

    public static void main(String[] args) {

        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("Uno ", 1);
        numberMapping.put("dos ", 2);
        numberMapping.put("tres ", 3);
        numberMapping.put("cuatro ", 4);
        numberMapping.put("cinco ", 5);
        numberMapping.put("cinco ", 5);// Only set a one value
        numberMapping.put(null, 7);
        numberMapping.put(null, 6);// Only set a one value, in this case the last...

        System.out.println(numberMapping);
        System.out.println("*******************");

        for (Map.Entry<String, Integer> entry : numberMapping.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("******** Check if a HashMap is empty***********");
        //Check if a HashMap is empty
        System.out.println(numberMapping.isEmpty());
        System.out.println("******** Find the size of a HashMap ***********");
        //Find the size of a HashMap
        System.out.println(numberMapping.size());
        System.out.println("********** containsKey *********");
        //Check if a Key exists in the HashMap
        System.out.println(numberMapping.containsKey("value 2")); // False --> Especie
        System.out.println(numberMapping.containsKey("value 2 ")); // True
        System.out.println("********** containsValue *********");
        System.out.println(numberMapping.containsValue(9)); // True
        System.out.println("********** getValue by Key *********");
        Integer v1 = numberMapping.get("value 4 ");
        System.out.println(v1);
        System.out.println("********** remove Keys in HashMap *********");
        numberMapping.remove(null, 7);
        for (Map.Entry<String, Integer> entry : numberMapping.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("///////////////////////");
        numberMapping.remove(null, 6);
        for (Map.Entry<String, Integer> entry : numberMapping.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println(numberMapping);
        System.out.println("******** Get only Keys from HashMap***********");
        Set<String> keys = numberMapping.keySet();
        System.out.println(keys);
        System.out.println("******** Get only Values from HashMap***********");
        Collection<Integer> values = numberMapping.values();
        System.out.println(values);
        System.out.println("******** Different way to Iterate over HashMap***********");
        for (Map.Entry<String, Integer> entry:numberMapping.entrySet()){
            System.out.println("Llave->" + entry.getKey() + "/valor ->" + entry.getValue());
        }
        System.out.println("******** Using Iterator over HashMap***********");
        Set<Map.Entry<String, Integer>> entradas = numberMapping.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entradas.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> i = iterator.next();
            System.out.println("[Llave]:" + i.getKey() + "[Valor]:" + i.getValue());
        }
        System.out.println("******** HashMap using Lambda ForEach Java 8 ***********");
        numberMapping.forEach((K,V) -> {
            System.out.println("[Key]:" + K + " / " +"[Value]:" + V);
        });





    }
}
