import java.util.*;

public class _TreeSet {
    public static void main(String[] args) {

        Set<String> names = new TreeSet<>();
        names.add("John");
        names.add("ALeo");
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
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        for (Integer i:
                numbers ) {
            System.out.println(i);
        }
        System.out.println("****************************");
        Set<Integer> addNumber = new TreeSet<>();
        addNumber.addAll(numbers);
        for (Integer i:
                addNumber) {
            System.out.println(i);
        }
        // O tambien se puede pasar directamente al constructor:
        System.out.println("****************************");
        Set<Integer> addNumber1 = new TreeSet<>(numbers); // <---
        for (Integer i:
                addNumber) {
            System.out.println(i);
        }
    }
}
