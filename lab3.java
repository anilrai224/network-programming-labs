
import java.net.*;

public class lab3 {

    public static void main(String[] args) {
        printIpAddress("www.scst.edu.np");
        printIpAddress("www.google.com");
        printIpAddress("www.facebook.com");
    }

    public static void printIpAddress(String host) {
        try {
            InetAddress addr = InetAddress.getByName(host);
            System.out.println(addr);
        } catch (UnknownHostException e) {
            System.out.println("Unable to resolve Host :" + e.getMessage());
        }
    }
}
