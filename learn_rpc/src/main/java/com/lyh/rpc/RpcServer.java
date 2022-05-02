package com.lyh.rpc;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/28 11:21 上午
 */
@Slf4j
public class RpcServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();

        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

        String className = objectInputStream.readUTF();
        String methodName = objectInputStream.readUTF();
        Class<?>[] parameterTypes = (Class<?>[]) objectInputStream.readObject();
        Object[] arg = (Object[]) objectInputStream.readObject();

        Class<?> clazz = Class.forName(className);
        Object instance = clazz.newInstance();
        Method method = clazz.getMethod(methodName, parameterTypes);
        Object object = method.invoke(instance, arg);

        log.info("ob : {}", object);

        objectOutputStream.writeObject(object);
        objectOutputStream.flush();


        objectInputStream.close();
        objectOutputStream.close();
        socket.close();

    }
}
/*
ServerSocket serverSocket = new ServerSocket(9000);
Socket socket = serverSocket.accept();

InputStream inputStream = socket.getInputStream();
OutputStream outputStream = socket.getOutputStream();
DataInputStream dataInputStream = new DataInputStream(inputStream);
ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

int id = dataInputStream.readInt();
System.out.println("id = " + id);

UserServiceImpl userService = new UserServiceImpl();
User user = userService.findUserById(id);
objectOutputStream.writeObject(user);
objectOutputStream.flush();


dataInputStream.close();
objectOutputStream.close();
socket.close();
 */
