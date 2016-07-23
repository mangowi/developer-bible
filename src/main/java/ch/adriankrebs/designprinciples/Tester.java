package ch.adriankrebs.designprinciples;

import ch.adriankrebs.designprinciples.composition.InstrumentedSet;
import ch.adriankrebs.designprinciples.inheritance.InstrumentedHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Adrian on 7/23/2016.
 */
public class Tester {

    public static void main(String[] args) {

        InstrumentedHashSet<String> s =
                new InstrumentedHashSet<String>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));

        // returns 6 but why??? we added 3 to the count on top of hashsets internal counter
        System.out.println(s.getAddCount());


        Set mySet = new HashSet<String>();
        InstrumentedSet<String> s2 =
                new InstrumentedSet<String>(mySet);

        s2.addAll(Arrays.asList("Snap", "Crackle", "Pop"));

        // returns 3
        System.out.println(s2.getAddCount());


   /*   The design of the InstrumentedSet class is enabled by the existence of the
        Set interface, which captures the functionality of the HashSet class. Besides
        being robust, this design is extremely flexible. The InstrumentedSet class implements the Set interface and has a single constructor whose argument is also of
        type Set. In essence, the class transforms one Set into another, adding the instrumentation functionality. Unlike the inheritance-based approach, which works only
        for a single concrete class and requires a separate constructor for each supported
        constructor in the superclass, the wrapper class can be used to instrument any Set
        implementation and will work in conjunction with any preexisting constructor:
        Set<Date> s = new InstrumentedSet<Date>(new TreeSet<Date>(cmp));
        Set<E> s2 = new InstrumentedSet<E>(new HashSet<E>(capacity));
        The InstrumentedSet class can even be used to temporarily instrument a set
                instance that has already been used without instrumentation:
        static void walk(Set<Dog> dogs) {
            InstrumentedSet<Dog> iDogs = new InstrumentedSet<Dog>(dogs);
            ... // Within this method use iDogs instead of dogs
        }*/
    }

}
