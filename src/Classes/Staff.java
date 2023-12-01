/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**

 @author nguye
 */
public class Staff {

    public String nameEmpl, phoneEmpl, AddressEmpl, Password, IDEmpl;
    public boolean role;
    public Date date;

    public String getIDEmpl() {
        return IDEmpl;
    }

    public void setIDEmpl(String IDEmpl) {
        this.IDEmpl = IDEmpl;
    }

    public String getNameEmpl() {
        return nameEmpl;
    }

    public void setNameEmpl(String nameEmpl) {
        this.nameEmpl = nameEmpl;
    }

    public String getPhoneEmpl() {
        return phoneEmpl;
    }

    public void setPhoneEmpl(String phoneEmpl) {
        this.phoneEmpl = phoneEmpl;
    }

    public String getAddressEmpl() {
        return AddressEmpl;
    }

    public void setAddressEmpl(String AddressEmpl) {
        this.AddressEmpl = AddressEmpl;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Staff() {
    }

    public Staff(String IDEmpl, String nameEmpl, String phoneEmpl, String AddressEmpl, String Password, boolean role, Date date) {
        this.IDEmpl = IDEmpl;
        this.nameEmpl = nameEmpl;
        this.phoneEmpl = phoneEmpl;
        this.AddressEmpl = AddressEmpl;
        this.Password = Password;
        this.role = role;
        this.date = date;
    }
}
