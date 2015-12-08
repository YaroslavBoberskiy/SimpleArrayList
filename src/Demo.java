import sun.java2d.pipe.SpanShapeRenderer;

import java.util.Iterator;

/**
 * Created by YB on 07.12.2015.
 */
public class Demo {

    public static void main(String [ ] args)
    {
        // create an array list
        SimpleArrayList al = new SimpleArrayList();
        System.out.println("Initial size of al: " + al.size());

        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("A");
        al.add("D");
        al.add("F");
        al.add("C");
        al.add("E");
        System.out.println("Size of al after additions: " + al.size());

        // get some elements from the array list
        System.out.println(al.get(2));
        System.out.println(al.get(0));
        System.out.println(al.get(5));

        // get index of element from the array list
        System.out.println(al.indexOf("E"));
        System.out.println(al.indexOf("C"));
        System.out.println(al.indexOf("F"));

        // get index of last occurrence of the specified element
        System.out.println(al.lastIndexOf("E"));
        System.out.println(al.lastIndexOf("C"));
        System.out.println(al.indexOf("F"));

        // remove element from the list
        System.out.println("==== PRINT ALL ELEMENTS ====");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        al.remove(8);

        System.out.println("==== PRINT ALL ELEMENTS AFTER REMOVE ====");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // Set new element in position
        al.set(0, "N");
        System.out.println("==== PRINT ALL ELEMENTS AFTER SET ====");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // Run over with iterator

        System.out.println("==== PRINT ALL ELEMENTS USING ITERATOR ====");
        Iterator iterator = al.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
