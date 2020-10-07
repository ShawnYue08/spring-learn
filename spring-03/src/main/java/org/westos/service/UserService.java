package org.westos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.westos.mapper.UserMapper;

import javax.annotation.Resource;

/**
 * @author lwj
 * @date 2020/10/7 16:03
 */
@Service
public class UserService {
    /*@Autowired
    @Qualifier(value = "userMapper1")*/

    @Resource()
    private UserMapper userMapper;
    @Value("张三")
    private String name;


    public void add() {
        userMapper.add();
        System.out.println("serviceAdd");
    }
}
