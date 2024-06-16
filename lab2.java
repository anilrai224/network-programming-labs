
import java.net.*;
import java.util.*;

public class lab2 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                System.out.println("Network Interface: " + networkInterface.getName());
            }
        } catch (SocketException e) {
            System.err.println("Error occurred while getting network interfaces: " + e.getMessage());
        }
    }
}
