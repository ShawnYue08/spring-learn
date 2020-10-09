package org.westos.service;

import org.westos.entity.Users;

import java.util.List;

/**
 * @author lwj
 * @date 2020/10/9 13:22
 */
public interface UsersService {
    /**
     * 查询所有Users
     * @return
     */
    List<Users> selectAll();
}
