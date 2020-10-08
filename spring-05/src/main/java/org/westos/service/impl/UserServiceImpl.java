package org.westos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.westos.entity.User;
import org.westos.mapper.UserMapper;
import org.westos.service.UserService;

/**
 * @author lwj
 * @date 2020/10/7 18:56
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userMapperImpl")
    private UserMapper userMapper;


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
