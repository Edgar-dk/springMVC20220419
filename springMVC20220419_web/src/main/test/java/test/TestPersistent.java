package test;

import com.sias.springMVC_20220419MVC.entity.EmpEntity;
import com.sias.springMVC_20220419MVC.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * @Author: zyg
 * @License: (C) Copyright 2005-2019, xxx Corporation Limited.
 * @Contact: ytzhaof@isoftstone.com
 * @Date: 2022/4/19 9:06
 * @Version: 1.0
 * @Description:
 */
@RunWith(value = SpringJUnit4ClassRunner.class)//使用spring的junit
@ContextConfiguration(value ={"classpath:spring_context.xml"})
public class TestPersistent {
    @Resource
    private EmpService empService;

    @Test
    public void test_save(){

        EmpEntity e=new EmpEntity();
        e.setEname("XIAOMING");
        e.setDeptno(10);
        e.setHiredate(Date.valueOf("1999-10-10"));
        e.setJob("CLERK");
        e.setSal(new BigDecimal("20000"));
        empService.saveEmp(e);//新增

    }
}
