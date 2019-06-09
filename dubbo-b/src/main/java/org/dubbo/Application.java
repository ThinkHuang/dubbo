package org.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo/dubbo-server.xml"})
public class Application
{
    public static void main(String[] args)
    {
        new SpringApplication(Application.class).run(args);
    }
}