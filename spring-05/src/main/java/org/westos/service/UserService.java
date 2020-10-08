package org.westos.service;

import org.westos.entity.User;

/**
 * @author lwj
 * @date 2020/10/7 18:55
 */
public interface UserService {
    /**
     * 添加用户
     * @param user 用户
     * @return 影响行数
     */
    int addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    int deleteUser(String userId);
}
