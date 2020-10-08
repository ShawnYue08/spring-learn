package org.westos.mapper.impl;

import org.westos.entity.User;
import org.westos.mapper.UserMapper;

/**
 * @author lwj
 * @date 2020/10/7 18:50
 */
public class UserMapperImpl implements UserMapper {
    //模拟数据库操作


    @Override
    public int addUser(User user) {
        System.out.println("UserMapperImpl >>> addUser");
        return 1;
    }

    @Override
    public int updateUser(User user) {
        System.out.println("UserMapperImpl >>> updateUser");
        return 1;
    }

    @Override
    public int deleteUser(String userId) {
        System.out.println("UserMapperImpl >>> deleteUser");
        return 1;
    }
}
