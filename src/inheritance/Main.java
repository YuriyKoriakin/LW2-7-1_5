package inheritance;

/**
 * Created by Yuriy on 26.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Device device=new Device("Sumsung",120,"AB123456");
        Monitor monitor=new Monitor("Sumsung",120,"AB123456",1280,1024);
        EthernetAdapter adapter=new EthernetAdapter(100,"TP-link");
        System.out.println(device);
        System.out.println(monitor);
        System.out.println(adapter);
    }

}
