
import java.net.*;

public class lab1 {
    public static void main(String[] args){
        try {
            InetAddress addr1 = InetAddress.getLocalHost();
            String mac = getMacAddress(addr1);
            System.out.println("IP Address: "+addr1);
            System.out.println("MAC address :"+mac);
        } catch (SocketException | UnknownHostException ex) {
            System.out.println(ex);
        }
    }
        private static String getMacAddress(InetAddress ip) throws SocketException {
        NetworkInterface network = NetworkInterface.getByInetAddress(ip);
        byte[] macArray = network.getHardwareAddress();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < macArray.length; i++) {
            sb.append(String.format("%02X%s", macArray[i], (i < macArray.length - 1) ? "-" : ""));
        }
        return sb.toString();
    }
}
