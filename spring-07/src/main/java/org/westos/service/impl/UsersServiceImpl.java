package org.westos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.westos.entity.Users;
import org.westos.mapper.UsersMapper;
import org.westos.service.UsersService;

import java.util.List;

/**
 * @author lwj
 * @date 2020/10/9 13:23
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    /**
     * 业务层的查询所有
     * @return
     */
    @Override
    public List<Users> selectAll() {
        return usersMapper.selectAll();
    }
}
