package org.westos.mapper.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.westos.entity.Users;
import org.westos.mapper.UsersMapper;

import java.util.List;

/**
 * @author lwj
 * @date 2020/10/9 13:16
 */
@Repository
public class UsersMapperImpl implements UsersMapper {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 查询所有用户的DAO层实现
     * @return
     */
    @Override
    public List<Users> selectAll() {
        return sqlSessionTemplate.selectList("org.westos.mapper.UsersMapper.selectAll");
    }
}
