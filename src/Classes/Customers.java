/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**

 @author nguye
 */
public class Customers {

    public int IDCus;
    public String nameCus, phoneCus, IDEmpl;
    public Date DateBirth;

    public Customers(int IDCus, String IDEmpl, String nameCus, String phoneCus, Date DateBirth) {
        this.IDCus = IDCus;
        this.IDEmpl = IDEmpl;
        this.nameCus = nameCus; 
        this.phoneCus = phoneCus;
        this.DateBirth = DateBirth;
    }

    public Customers() {
    }

    public int getIDCus() {
        return IDCus;
    }

    public void setIDCus(int IDCus) {
        this.IDCus = IDCus;
    }

    public String getIDEmpl() {
        return IDEmpl;
    }

    public void setIDEmpl(String IDEmpl) {
        this.IDEmpl = IDEmpl;
    }

    public String getNameCus() {
        return nameCus;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public String getPhoneCus() {
        return phoneCus;
    }

    public void setPhoneCus(String phoneCus) {
        this.phoneCus = phoneCus;
    }

    public Date getDateBirth() {
        return DateBirth;
    }

    public void setDateBirth(Date DateBirth) {
        this.DateBirth = DateBirth;
    }

}
