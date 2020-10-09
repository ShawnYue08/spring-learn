package org.westos.mapper;

import org.westos.entity.Users;

import java.util.List;

public interface UsersMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<Users> selectAll();
}