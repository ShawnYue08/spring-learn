package org.westos.service.impl;

import org.westos.entity.Users;
import org.westos.mapper.UsersMapper;
import org.westos.service.UsersService;

import java.util.List;

/**
 * @author lwj
 * @date 2020/10/9 13:23
 */
public class UsersServiceImpl implements UsersService {
    private UsersMapper usersMapper;

    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    /**
     * 业务层的查询所有
     * @return
     */
    @Override
    public List<Users> selectAll() {
        return usersMapper.selectAll();
    }
}
