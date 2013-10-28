package main.test.tests;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/13/13
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 *
 * EmployeeDetails class is used to
 *      get/set the value of employee's name.
 *      get/set the value of employee's monthly salary.
 *      get/set the value of employee's age.
 *
 *
 */
public class EmployeeDetails {

    private String name;
    private double monthlySalary;
    private int age;

    /**
     * @return the name
     */
    public String getName(){
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * @return the monthlySalary
     */
    public double getMonthlySalary(){
        return monthlySalary;
    }

    /**
     * @param monthlySalary the monthlySalary to set
     */
    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    /**
     * @return the age
     */
    public int getAge(){
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age){
        this.age = age;
    }
}
