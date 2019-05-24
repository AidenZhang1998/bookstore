package zut.cs.network.service;

import org.junit.Test;
import zut.cs.network.bean.User;
import zut.cs.network.exception.RegisterException;

import static org.junit.Assert.*;

public class UserServiceTest {

    @Test
    public void register() {
        User user =new User();
        user.setActiveCode("1");
        user.setState(2);
        user.setUsername("吃屎杰");
        user.setEmail("1845508414@qq.com");
        user.setPassword("123");
        UserService userService =new UserService();
        try {
            userService.register(user);
        } catch (RegisterException e) {
            e.printStackTrace();
        }

    }
}