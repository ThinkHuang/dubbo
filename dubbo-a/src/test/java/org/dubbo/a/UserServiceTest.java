package org.dubbo.a;

import java.util.List;

import org.dubbo.bean.User;
import org.dubbo.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest
{
    private UserService userService;
    
    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:dubbo/dubbo-*.xml");
        userService = applicationContext.getBean(UserService.class);
    }

    @Test
    public void testQueryAll() {
        List<User> userList = userService.queryAll();
        for(User user : userList){
            System.out.println(user.toString());
        }
    }
}
