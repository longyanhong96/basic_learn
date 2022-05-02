package com.lyh.rpc;

import lombok.extern.slf4j.Slf4j;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/28 3:01 下午
 */
@Slf4j
public class ClientStub {
    public static UserService getStub() {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        UserService userService = (UserService) Proxy.newProxyInstance(userServiceImpl.getClass().getClassLoader(), new Class[]{UserService.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Socket socket = new Socket("localhost", 9000);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

                log.info("class:{},method:{}", method.getClass(), method.getName());

                String classname = userServiceImpl.getClass().getName();

                objectOutputStream.writeUTF(classname);
                objectOutputStream.writeUTF(method.getName());
                objectOutputStream.writeObject(method.getParameterTypes());
                objectOutputStream.writeObject(args);
                objectOutputStream.flush();

                Object readObject = objectInputStream.readObject();
                objectOutputStream.close();
                objectInputStream.close();
                socket.close();

                return readObject;
            }
        });

        return userService;
    }

    public static Object getStub(Class clazz){
        Object proxyInstance = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Socket socket = new Socket("localhost", 9000);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

                objectOutputStream.writeUTF(clazz.getName());
                objectOutputStream.writeUTF(method.getName());
                objectOutputStream.writeObject(method.getParameterTypes());
                objectOutputStream.writeObject(args);
                objectOutputStream.flush();

                Object readObject = objectInputStream.readObject();
                objectOutputStream.close();
                objectInputStream.close();
                socket.close();

                return readObject;
            }
        });

        return proxyInstance;
    }
}
/*
UserServiceImpl userServiceImpl = new UserServiceImpl();
UserService userService = (UserService) Proxy.newProxyInstance(userServiceImpl.getClass().getClassLoader(), new Class[]{UserService.class}, new InvocationHandler() {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Socket socket = new Socket("localhost", 9000);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

        log.info("class:{},method:{}", method.getClass(), method.getName());

        String classname = userServiceImpl.getClass().getName();

        objectOutputStream.writeUTF(classname);
        objectOutputStream.writeUTF(method.getName());
        objectOutputStream.writeObject(method.getParameterTypes());
        objectOutputStream.writeObject(args);
        objectOutputStream.flush();

        Object readObject = objectInputStream.readObject();
        objectOutputStream.close();
        objectInputStream.close();
        socket.close();

        return readObject;
    }
});

return userService;
 */
