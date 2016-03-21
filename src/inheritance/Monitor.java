package inheritance;

/**
 * Created by Yuriy on 26.02.2016.
 */
public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);//одразу проставило супер
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    //2-7-2
    @Override
    public String toString() {
        return "Monitor:" +
                "manufacturer:" + getManufacturer() + "," +
                "price=" + getPrice() + "," +
                "serial number:" + getSerialNumber() + "," +
                "X=" + resolutionX + "," +
                "Y=" + resolutionY;
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
