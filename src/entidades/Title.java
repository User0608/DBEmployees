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
public class Title {
    private double emp_no;
    private String title;
    private Date form_date;
    private Date to_date;

    public Title(double emp_no, String title, Date form_date, Date to_date) {
        this.emp_no = emp_no;
        this.title = title;
        this.form_date = form_date;
        this.to_date = to_date;
    }

    public double getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(double emp_no) {
        this.emp_no = emp_no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getForm_date() {
        return form_date;
    }

    public void setForm_date(Date form_date) {
        this.form_date = form_date;
    }

    public Date getTo_date() {
        return to_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }

    @Override
    public String toString() {
        return "Title{" + "emp_no=" + emp_no + ", title=" + title + ", form_date=" + form_date + ", to_date=" + to_date + '}';
    }
    
}
