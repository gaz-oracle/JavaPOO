package com.gaz.app.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeHashSet {
    public static void main(String[] args) {

        Set<Integer> names = new HashSet<>();
        names.add(1);
        names.add(2);
        names.add(3);
        names.add(4);
        names.add(5);
        names.add(6);
        names.add(7);
        names.add(8);
        names.add(9);
        names.add(10);
      //  names.add("Polh");

        System.out.println("************* names ***************");
        System.out.println(names);

        Set<Integer> names2 = new HashSet<>();
        names2.add(2);
        names2.add(4);
        names2.add(6);
        names2.add(8);
        names2.add(10);



        // remove element with method:
        //boolean result = names.remove("Polh");
        System.out.println("************* names2 ***************");
        System.out.println(names2);
       // System.out.println(names);
      //  System.out.println("Result Boolean: " + result);
        System.out.println("**************removeAll(names2)**************");
        names.removeAll(names2); //-->BORRA EN LA UNION DE CONJUNTOS LOS NUMEROR REPETIDOS EN AMBAS COLECCIONES.
        System.out.println(names);

        System.out.println("**************clear  **************");
        names.clear();//claer() borra todo.
        System.out.println(names);
    }
}
/* --> removeAll(names2):
Elimina de este conjunto todos sus elementos que están contenidos en la colección especificada
(operación opcional). Si la colección especificada también es un conjunto, esta operación modifica
efectivamente este conjunto para que su valor sea la diferencia de conjuntos asimétricos de los dos conjuntos.
 */