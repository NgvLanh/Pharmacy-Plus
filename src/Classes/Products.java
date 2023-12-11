/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**

 @author nguye
 */
public class Products {

    public int IDPro;
    public String namePro, Image, type, Supplier, IDEmpl;
    public float price;
    public Date date;

    public Products() {
    }

    public Products(int IDPro, String namePro, String Image, String type, String Supplier, String IDEmpl, float price, Date date) {
        this.IDPro = IDPro;
        this.namePro = namePro;
        this.Image = Image;
        this.type = type;
        this.Supplier = Supplier;
        this.IDEmpl = IDEmpl;
        this.price = price;
        this.date = date;
    }

    public int getIDPro() {
        return IDPro;
    }

    public void setIDPro(int IDPro) {
        this.IDPro = IDPro;
    }

    public String getNamePro() {
        return namePro;
    }

    public void setNamePro(String namePro) {
        this.namePro = namePro;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    public String getIDEmpl() {
        return IDEmpl;
    }

    public void setIDEmpl(String IDEmpl) {
        this.IDEmpl = IDEmpl;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    

}
