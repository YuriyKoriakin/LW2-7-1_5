package inheritance;

/**
 * Created by Yuriy on 26.02.2016.
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) { //generate constructor
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //Alt+ins
    //2-7-2
    @Override
    public String toString() {
        return "Device:" +
                "manufacturer:" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber;
    }

    //2-7-3
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //2-7-4
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
