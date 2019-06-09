package org.dubbo.a.service.impl;

import java.util.List;

import org.dubbo.a.service.IQueryService;
import org.dubbo.bean.User;
import org.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryService implements IQueryService
{
    @Autowired
    private UserService userService;
    
    @Override
    public void testQueryAll()
    {
        List<User> users = userService.queryAll();
        for (User user : users)
        {
            System.out.println(user);
        }
    }
}
