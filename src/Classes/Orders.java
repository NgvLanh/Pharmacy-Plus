/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**

 @author nguye
 */
public class Orders {

    public String IDEmpl;
    public int IDBill, IDCus;
    public Date date;
    public float total;

    public int getIDBill() {
        return IDBill;
    }

    public void setIDBill(int IDBill) {
        this.IDBill = IDBill;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Orders() {
    }

    public Orders(int IDBill, int IDCus, String IDEmpl, Date date, float total) {
        this.IDBill = IDBill;
        this.IDCus = IDCus;
        this.IDEmpl = IDEmpl;
        this.date = date;
        this.total = total;
    }   
}
