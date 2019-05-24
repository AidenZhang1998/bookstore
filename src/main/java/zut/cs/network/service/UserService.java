package zut.cs.network.service;

import zut.cs.network.bean.User;
import zut.cs.network.dao.UserDao;
import zut.cs.network.exception.RegisterException;
import zut.cs.network.utils.MailUtils;

public class UserService {

    private UserDao dao = new UserDao();
    // 注册操作
    public void register(User user) throws RegisterException {
        // 调用dao完成注册操作
        try {
            dao.addUser(user);
            // 发送激活邮件
            String emailMsg = "感谢您注册网上书城，点击<a href='http://localhost:8080/bookstore/activeUser?activeCode="
                    + user.getActiveCode() + "'>&nbsp;激活&nbsp;</a>后使用。<br>为保障您的账户安全，请在24小时内完成激活操作";
            MailUtils.sendMail(user.getEmail(), emailMsg);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RegisterException("注冊失败");
        }
    }
}
