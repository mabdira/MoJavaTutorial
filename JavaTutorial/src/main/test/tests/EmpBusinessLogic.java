package main.test.tests;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/13/13
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 *
 * EmpBusinessLogic class is used for calculating
 *      the yearly salary of employee.
 *      the appraisal amount of employee.
 *
 */
public class EmpBusinessLogic {

    /** calculate the yearly salary of employee
     *
     * @param employeeDetails the employee to calculate
     * @return the yearly salary
     */
    public double calculateYearlySalary(EmployeeDetails employeeDetails){
        double yearlySalary = 0;
        yearlySalary = employeeDetails.getMonthlySalary() * 12;
        return yearlySalary;
    }

    /** calculate the appraisal amount of employee
     * @param  employeeDetails the employee to calculate
     * @return the appraisal amount
     */
    public double calculateAppraisal(EmployeeDetails employeeDetails){
        double appraisal = 0;
        if(employeeDetails.getMonthlySalary() < 10000){
            appraisal = 500;
        }
        else {
            appraisal = 1000;
        }

        return appraisal;
    }


}
