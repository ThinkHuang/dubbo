package org.dubbo.service;

import java.util.List;

import org.dubbo.bean.User;

public interface UserService
{
    /**
     * 查询所有用户
     * @return
     */
    public List<User> queryAll();
}
