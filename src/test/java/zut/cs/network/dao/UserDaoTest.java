package zut.cs.network.dao;

import org.junit.Test;
import zut.cs.network.bean.User;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void AddUser() {
    }

    @Test
    //测试根据激活码修改用户激活状态
    public void findUserByActiveCode() {
        User user =new User();
        user.setActiveCode("1");
        user.setState(2);
        UserDao userDao =new UserDao();
        try {
            userDao.activeUser("1");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void activeUser() {
    }

    @Test
    public void findUserByUsernameAndPassword() {
    }
}