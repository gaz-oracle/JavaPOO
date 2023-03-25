import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // nullValueDemo();
        // duplicateValueDemo();
        //unordered();
    }
    // Set can contain one null value
    public static void nullValueDemo()
    {
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        set.add(null);
        set.add("element1");
        System.out.println(set.toString());
    }
    //Its not contain duplicate elements
    public static void duplicateValueDemo()
    {
        Set<String> set = new HashSet<>();
        set.add("element1");
        set.add("element1");
        System.out.println(set.toString());
    }
    // Its a collection unordered/desordenado
    public static void unordered()
    {
        Set<String> set = new HashSet<>();
        set.add("element0");
        set.add("element6");
        set.add("element5");
        set.add("alement1");
        set.add("element7");
        set.add("element3");
        set.add("element2");
        //display only one element
        System.out.println(set.toString());


    }

}

/*
La clase HashSet implementa la interfaz Set , respaldada por una tabla hash que en realidad es una
instancia de HashMap . No se garantiza el orden de iteración del conjunto, lo que significa que la
clase no garantiza el orden constante de los elementos a lo largo del tiempo.
Esta clase permite el elemento nulo.
La clase también ofrece un rendimiento de tiempo constante para las operaciones básicas
como agregar, eliminar, contener y dimensionar, suponiendo que la función hash dispersa los elementos
correctamente entre los cubos, que veremos más adelante en el artículo.

Algunas características importantes de HashSet son:

Implementa la interfaz de conjunto .
La estructura de datos subyacente para HashSet es Hashtable .
Como implementa Set Interface, no se permiten valores duplicados.
No se garantiza que los objetos que inserte en HashSet se inserten en el mismo orden.
Los objetos se insertan en función de su código hash.
Los elementos NULL están permitidos en HashSet.
HashSet también implementa interfaces serializables y clonables .

Características de HashSet:
Implementa la interface Set.
La estructura de datos subyacente para HashSet es hashtable.
A medida que implementa la interfaz de configuración, no se permiten valores duplicados.
No se garantiza que los objetos que inserte en HashSet se inserten en el mismo orden.
Los objetos se insertan en función de su código hash.
Se permiten elementos NULL en HashSet.
HashSet también implementa interfaces serializables y clonables
no mantine un orden de natural de Inseccion.
 */