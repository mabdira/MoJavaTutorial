package com.tutorials_point.Serialization;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 7/5/13
 * Time: 4:51 PM
 * To change this template use File | Settings | File Templates.
 *
 * Java provides a mechanism, called object serialization where an object can be
 * represented as a sequence of bytes that includes the object's data as well
 * as information about the object's type and the types of data stored in the
 * object.
 *
 * After a serialized object has been written into a file, it can be read from
 * the file and deserialized that is, the type information and bytes that
 * represent the object and its data can be used to recreate the object in
 * memory.
 *
 * Most impressive is that the entire process is JVM independent, meaning an
 * object can be serialized on one platform and deserialized on an entirely
 * different platform.
 *
 * Classes ObjectInputStream and ObjectOutputStream are high-level streams that
 * contain the methods for serializing and deserializing an object.
 */
public class Employee implements Serializable{
    // internal variable data
    private String name;
    private String address;
    private transient int SSN;
    private int number;

    public Employee(final String name, final String address,
                    final int SSN, final int number){
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }

    public void mailCheck(){
        System.out.println("Mailing a check to " + this.name + " "
                            + this.address);
    }

    public String getName() {
        return name;
    }

    public int getSSN() {
        return SSN;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }
}