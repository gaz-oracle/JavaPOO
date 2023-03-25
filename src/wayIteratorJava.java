import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class wayIteratorJava {
/*
1. ENHACEND FOR LOOP.
2. BASIC LOOP WTIH ITEREATOR.
3. WHILE LOOP WTIH ITEREATOR.
4. FOREACH + LAMBDA EXPRESSION.
5. FOR STREAMING + FOREACH + LAMBDA EXPRESSION.
 */
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Leo");
        names.add("Isa");
        names.add("Mark");
        names.add("Polh");
        names.add("John");
        System.out.println("************** 1. ENHACEND FOR LOOP **************");
        for (String i:
                names) {
            System.out.println(i);
        }
        System.out.println("************** 2. BASIC LOOP WTIH ITEREATOR **************");
        for (Iterator iterator = names.iterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
        System.out.println("************** 3. WHILE LOOP WTIH ITEREATOR **************");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()){
            String name = (String) iterator.next();
            System.out.println(name);
        }
        System.out.println("************** 4. FOREACH + LAMBDA EXPRESSION **************");
         names.forEach(i -> System.out.println(i));

        System.out.println("************** 5. FOR STREAMING + FOREACH + LAMBDA EXPRESSION WITH:FILTER **************");
        names.stream().filter(name -> !"Polh".equals(name)).forEach(i -> System.out.println(i));
        System.out.println("************** 5. FOR STREAMING + FOREACH + LAMBDA EXPRESSION **************");
        names.stream().forEach(i -> System.out.println(i));
    }
}
