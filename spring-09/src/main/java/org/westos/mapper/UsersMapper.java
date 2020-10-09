package org.westos.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.westos.entity.Users;

import java.util.List;

@MapperScan
public interface UsersMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<Users> selectAll();
}