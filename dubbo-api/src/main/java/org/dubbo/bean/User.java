package org.dubbo.bean;

import java.io.Serializable;

public class User implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 437965667836406213L;

    private Long id;
    
    private String username;
    
    private String password;
    
    private Integer age;
    
    public Long getId()
    {
        return id;
    }
    
    public void setId(Long id)
    {
        this.id = id;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public Integer getAge()
    {
        return age;
    }
    
    public void setAge(Integer age)
    {
        this.age = age;
    }
    
    @Override
    public String toString()
    {
        return "User [username=" + username + ", age=" + age + "]";
    }
    
}
