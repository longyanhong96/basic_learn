package network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/28 11:19 上午
 */
public class NetworkClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        dataOutputStream.writeUTF("test");
        dataOutputStream.writeUTF("test1");
        dataOutputStream.flush();

        dataOutputStream.close();
        socket.close();
    }
}
