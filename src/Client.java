import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(12345);
        byte[] data =  new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);

//        receive message
        socket.receive(packet);
        String messageReceived = new String(packet.getData(), 0, packet.getLength());
        System.out.println(messageReceived);
        socket.close();
    }
}