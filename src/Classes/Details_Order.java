/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**

 @author nguye
 */
public class Details_Order {

    public int IDdetails, IDOders, IDProduct, Quality;
    public String nameDetails;
    public float priceDetails;

    public Details_Order(int IDdetails, int IDOders, int IDProduct, int Quality, String nameDetails, float priceDetails) {
        this.IDdetails = IDdetails;
        this.IDOders = IDOders;
        this.IDProduct = IDProduct;
        this.Quality = Quality;
        this.nameDetails = nameDetails;
        this.priceDetails = priceDetails;
    }

    public Details_Order() {
    }

    public int getIDdetails() {
        return IDdetails;
    }

    public void setIDdetails(int IDdetails) {
        this.IDdetails = IDdetails;
    }

    public int getIDOders() {
        return IDOders;
    }

    public void setIDOders(int IDOders) {
        this.IDOders = IDOders;
    }

    public int getIDProduct() {
        return IDProduct;
    }

    public void setIDProduct(int IDProduct) {
        this.IDProduct = IDProduct;
    }

    public int getQuality() {
        return Quality;
    }

    public void setQuality(int Quality) {
        this.Quality = Quality;
    }

    public String getNameDetails() {
        return nameDetails;
    }

    public void setNameDetails(String nameDetails) {
        this.nameDetails = nameDetails;
    }

    public float getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(float priceDetails) {
        this.priceDetails = priceDetails;
    }

}
