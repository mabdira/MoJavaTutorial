package main.test.tests;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/13/13
 * Time: 5:29 PM
 * To change this template use File | Settings | File Templates.
 *
 * TestEmployeeDetails class is used for testing the methods of EmpBusinessLogic
 * class. It
 *      tests the yearly salary of the employee.
 *      tests the appraisal amount of the employee.
 *
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {

    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    // test to check appraisal
    @Test
    public void testCalculateAppriasal(){
        employee.setName("Rajeev");
        employee.setMonthlySalary(8000);
        employee.setAge(25);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(500, appraisal, 0.0);
    }

    // test to check yearly salary
    @Test
    public void testCalculateYearlySalary(){
        employee.setAge(25);
        employee.setName("Rajeev");
        employee.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(96000, salary, 0.0);
    }
}
