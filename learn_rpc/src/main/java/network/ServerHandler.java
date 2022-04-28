package network;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/28 10:00 上午
 */
@AllArgsConstructor
@Slf4j
public class ServerHandler implements Runnable {

    private Socket socket;

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        log.info("thread name : {} ,socket port: {}", Thread.currentThread().getName(), socket.getPort());
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            int len;
            byte[] bytes = new byte[5];
            while ((len = dataInputStream.read(bytes)) != 0) {
                System.out.println("s = " + new String(bytes, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
