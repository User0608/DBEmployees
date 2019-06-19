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
public class Employee {
    private double emp_no;
    private Date birth_date;
    private String first_neme;
    private String last_neme;
    private char gender;
    private Date hire_date;

    public Employee(double emp_no, Date birth_date, String first_neme, String last_neme, char gender, Date hire_date) {
        this.emp_no = emp_no;
        this.birth_date = birth_date;
        this.first_neme = first_neme;
        this.last_neme = last_neme;
        this.gender = gender;
        this.hire_date = hire_date;
    }

    public double getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(double emp_no) {
        this.emp_no = emp_no;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getFirst_neme() {
        return first_neme;
    }

    public void setFirst_neme(String first_neme) {
        this.first_neme = first_neme;
    }

    public String getLast_neme() {
        return last_neme;
    }

    public void setLast_neme(String last_neme) {
        this.last_neme = last_neme;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }
    
}
