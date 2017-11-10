package cn.bdqn.dao.com;

import java.util.List;

import cn.bdqn.entiy.com.User;

public interface UserDao {
public List<User> getUserList(User user);

public String getNameById(int i);
}
