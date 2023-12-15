
package Classes;

/**
 *
 * @author admin
 */
public class Suppliers {

    public String IDSupplier, nameSupplierString, phone, address;

    public Suppliers() {
    }

    public Suppliers(String IDSupplier, String nameSupplierString, String phone, String address) {
        this.IDSupplier = IDSupplier;
        this.nameSupplierString = nameSupplierString;
        this.phone = phone;
        this.address = address;
    }

    public String getIDSupplier() {
        return IDSupplier;
    }

    public void setIDSupplier(String IDSupplier) {
        this.IDSupplier = IDSupplier;
    }

    public String getNameSupplierString() {
        return nameSupplierString;
    }

    public void setNameSupplierString(String nameSupplierString) {
        this.nameSupplierString = nameSupplierString;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
