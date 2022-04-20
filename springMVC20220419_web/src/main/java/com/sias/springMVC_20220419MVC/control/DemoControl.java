package com.sias.springMVC_20220419MVC.control;

import com.sias.springMVC_20220419MVC.entity.EmpEntity;
import com.sias.springMVC_20220419MVC.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * @Author: zyg
 * @License: (C) Copyright 2005-2019, xxx Corporation Limited.
 * @Contact: ytzhaof@isoftstone.com
 * @Date: 2022/4/19 9:12
 * @Version: 1.0
 * @Description:
 */
@Controller
@RequestMapping("/demo")
public class DemoControl {
    @Resource
    private EmpService empService;

    @RequestMapping("/save")
    public String save(){
        EmpEntity e=new EmpEntity();
        e.setEname("SMITH");
        e.setDeptno(20);
        e.setHiredate(Date.valueOf("1999-10-10"));
        e.setJob("NN");
        e.setSal(new BigDecimal("20000"));
        empService.saveEmp(e);//新增
        return "/success";
    }
}
