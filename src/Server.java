import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket();
        String message = "Ujwale chor ho";
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(message.getBytes(),message.length(), address, 12345);


//        send message
        datagramSocket.send(packet);
        datagramSocket.close();
    }
}