/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.sql.Date;
/**
 *
 * @author adriana
 */
public class Salary {
    private double emp_no;
    private double salary;
    private Date from_date;
    private Date to_date;

    public double getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(double emp_no) {
        this.emp_no = emp_no;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getFrom_date() {
        return from_date;
    }

    public void setFrom_date(Date from_date) {
        this.from_date = from_date;
    }

    public Date getTo_date() {
        return to_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }
    
}
