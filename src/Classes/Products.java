/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**

 @author nguye
 */
public class Products {

    public int IDPro;
    public String namePro, Image, Details, Supplier, IDEmpl;
    public float price;

    public Products(int IDPro, String IDEmpl, String namePro, String Image, String Details, String Supplier, float price) {
        this.IDPro = IDPro;
        this.IDEmpl = IDEmpl;
        this.namePro = namePro;
        this.Image = Image;
        this.Details = Details;
        this.Supplier = Supplier;
        this.price = price;
    }

    public Products() {
    }

    public int getIDPro() {
        return IDPro;
    }

    public void setIDPro(int IDPro) {
        this.IDPro = IDPro;
    }

    public String getIDEmpl() {
        return IDEmpl;
    }

    public void setIDEmpl(String IDEmpl) {
        this.IDEmpl = IDEmpl;
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

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
