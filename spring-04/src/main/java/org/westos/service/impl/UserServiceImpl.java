package org.westos.service.impl;

import org.westos.entity.User;
import org.westos.mapper.UserMapper;
import org.westos.service.UserService;

/**
 * @author lwj
 * @date 2020/10/7 18:56
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int addUser(User user) {
        if (true) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println("UserServiceImpl >>> addUser");
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        System.out.println("UserServiceImpl >>> updateUser");
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(String userId) {
        System.out.println("UserServiceImpl >>> deleteUser");
        return userMapper.deleteUser(userId);
    }
}
