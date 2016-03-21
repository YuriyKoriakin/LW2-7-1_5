package inheritance;

/**
 * Created by Yuriy on 26.02.2016.
 */
public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac) {
        super("TP-Link", 200, "abc");
        this.speed = speed;
        this.mac = mac;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    //2-7-2
    @Override
    public String toString() {
        return "EthernetAdapter:" +
                "manufacturer:" + getManufacturer() + "," +
                "price=" + getPrice() + "," +
                "serial number:" + getSerialNumber() + "," +
                "speed=" + speed +
                ", mac=" + mac;
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
