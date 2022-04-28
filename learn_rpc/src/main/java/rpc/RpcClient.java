package rpc;

import bean.Score;
import bean.User;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/28 11:21 上午
 */
public class RpcClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        UserService userService = ClientStub.getStub();
//        User userById = userService.findUserById(123);
//        System.out.println("userById = " + userById);

//        boolean save = userService.saveUserById(1123, "save");
//        System.out.println("save = " + save);

        ScoreService scoreService = (ScoreService) ClientStub.getStub(UserServiceImpl.class);
        Score scoreById = scoreService.findScoreById(123);
        System.out.println("scoreById = " + scoreById);
    }
}

/*
        Socket socket = new Socket("localhost", 9000);

        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        dataOutputStream.writeInt(123);
        dataOutputStream.writeUTF("test");
        dataOutputStream.flush();

        User user = (User) objectInputStream.readObject();
        System.out.println("user = " + user);

        dataOutputStream.close();
        objectInputStream.close();
        socket.close();
 */
