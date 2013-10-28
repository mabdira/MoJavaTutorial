package com.tutorials_point.Generics;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/5/13
 * Time: 4:05 PM
 * To change this template use File | Settings | File Templates.
 *
 * Java Generic methods and generic classes enable programmers to specify, with
 * a single method declaration, a set of related methods or, with a single class
 * declaration, a set of related types, respectively.
 *
 * Generics also provide compile-time type safety that allows programmers to
 * catch invalid types at compile time.
 */
public class GenericMethod {

    // generic method to display array values
    public static <E> void printArray(E[] array){
        for(E element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array Integers contain:");
        printArray(intArray);
        System.out.println("Array Doubles contain:");
        printArray(doubleArray);
        System.out.println("Array Characters contain:");
        printArray(charArray);
    }
}
