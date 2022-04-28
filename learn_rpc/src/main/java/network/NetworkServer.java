package network;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/27 5:41 下午
 */
public class NetworkServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        System.out.println(dataInputStream.readUTF());
        System.out.println(dataInputStream.readUTF());

        dataInputStream.close();
        socket.close();
    }
}

/*
        ServerSocket serverSocket = new ServerSocket(9999);
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        while (true) {
            Socket accept = serverSocket.accept();

            executorService.submit(new ServerHandler(accept));
        }
 */