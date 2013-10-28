package com.tutorials_point.Generics;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/5/13
 * Time: 4:34 PM
 * To change this template use File | Settings | File Templates.
 *
 * A generic class declaration looks like a non-generic class declaration,
 * except that the class name is followed by a type parameter section.
 *
 * As with generic methods, the type parameter section of a generic class can
 * have one or more type parameters separated by commas. These classes are
 * known as parameterized classes or parameterized types because they accept
 * one or more parameters.
 */

class Box<T>{
    // data variables
    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
       return this.t;
    }
}

public class GenericClass {
    public static void main(String[] args){
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value: %d\n\n", integerBox.get());
        System.out.printf("String Value: %s\n", stringBox.get());
    }
}
