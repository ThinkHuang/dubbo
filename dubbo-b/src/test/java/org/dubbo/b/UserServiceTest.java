package org.dubbo.b;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest
{
    @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:dubbo/dubbo-*.xml");
        applicationContext.start();
        System.in.read(); // 按任意键退出
    }
    
    @Test
    public void start()
    {
        System.out.println("service b starting ...");
    }
}
