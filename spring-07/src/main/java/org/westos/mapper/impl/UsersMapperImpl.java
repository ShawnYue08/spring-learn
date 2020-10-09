package org.westos.mapper.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.westos.entity.Users;
import org.westos.mapper.UsersMapper;

import java.util.List;

/**
 * @author lwj
 * @date 2020/10/9 14:09
 */
public class UsersMapperImpl extends SqlSessionDaoSupport implements UsersMapper {
    /**
     * 查询所有用户，利用SqlSessionDaoSupport类中的getSession()方法
     * SqlSession，作用域应该为方法级别
     * @return
     */
    @Override
    public List<Users> selectAll() {
        return this.getSqlSession().selectList("org.westos.mapper.UsersMapper.selectAll");
    }
}
