package com.tutorials_point.DataStructures;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/3/13
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 * Implement and test Comparable vs Comparator interfaces?
 */

class Person implements Comparable<Person>{
    // private data
    private String name;

    // Constructor
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int hashcode = name != null ? name.hashCode() : 0;
        return hashcode;
    }


    @Override
    public int compareTo(final Person o) {
        return this.name.compareTo(o.getName());
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Comparable_Comparator_Interfaces {
    public static void main(String[] args){
        // Create ArrayList
        List<Person> list = new ArrayList<Person>();
        // Create a TreeSet
        Set<Person> set = new TreeSet<Person>();
        // Create a TreeMap
        SortedMap<Person, Integer> map = new TreeMap<Person, Integer>();

        // populate the list, set and map collection
        addElements(list);
        addElements(set);
        addEntries(map);

        // Sort the list using Comparator object
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(final Person o1, final Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // Display the collection values
        System.out.println("ArrayList after sorted: ");
        showElements(list);
        System.out.println();
        System.out.println("TreeSet: ");
        showElements(set);
        System.out.println();
        System.out.println("TreeMap: ");
        showEntries(map);

        // Check for equality between objects
        Person p1 = list.get(3); // Mike
        Person p2 = list.get(4); // Mike
        Person p3 = new Person("Mike");
        System.out.println();
        System.out.println("Set size is: " + set.size());
        System.out.println("Set contains Mike: "
                + set.contains(new Person("Mike")));
        System.out.println("Map contains key Clare: "
                + map.containsKey(new Person("Clare")));
        System.out.println("Is p1.equals(p3): " + p1.equals(p3));
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("Hashcode of p1: " + p1.hashCode());
        System.out.println("Hashcode of p2: " + p2.hashCode());
        System.out.println("Hashcode of p3: " + p3.hashCode());
        System.out.println("p1.getClass(): " + p1.getClass());
        System.out.println("p3.getClass(): " + p3.getClass());
    }

    private static void addElements(Collection<Person> col) {
            col.add(new Person("Joe"));
            col.add(new Person("Sue"));
            col.add(new Person("Juliet"));
            col.add(new Person("Clare"));
            col.add(new Person("Mike"));
    }

    private static void addEntries(Map<Person, Integer> map){
        map.put(new Person("Joe"), 1);
        map.put(new Person("Sue"), 2);
        map.put(new Person("Juliet"), 3);
        map.put(new Person("Clare"), 4);
        map.put(new Person("Mike"), 5);
    }

    private static void showElements(Collection<Person> col) {
        for(Person element: col) {
            System.out.println(element);
        }
    }

    private static void showEntries(Map<Person, Integer> map) {
        for(Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
