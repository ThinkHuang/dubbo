package org.dubbo.a.controller;

import javax.annotation.Resource;

import org.dubbo.a.service.IQueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class QueryController
{
    @Resource
    private IQueryService queryService;
    
    @GetMapping("/testquery")
    public void testQuery()
    {
        queryService.testQueryAll();
    }
}
