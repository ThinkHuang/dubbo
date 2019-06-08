package org.dubbo.bean;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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
}
