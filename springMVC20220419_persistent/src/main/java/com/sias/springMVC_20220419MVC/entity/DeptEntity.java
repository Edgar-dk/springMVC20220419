package com.sias.springMVC_20220419MVC.entity;

import com.sun.xml.internal.org.jvnet.staxex.Base64EncoderStream;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: zyg
 * @License: (C) Copyright 2005-2019, xxx Corporation Limited.
 * @Contact: ytzhaof@isoftstone.com
 * @Date: 2022/4/6 12:01
 * @Version: 1.0
 * @Description:
 * create table dept(deptno int (5) primary key,dname varchar(20), local varchar(20));
 * insert into dept values(10,'CLERK','BeiJing');
 */
public class DeptEntity extends BaseEntity {
    private Integer deptno;
    private String dname;
    private String local;

    private List<EmpEntity> list;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<EmpEntity> getList() {
        return list;
    }

    public void setList(List<EmpEntity> list) {
        this.list = list;
    }
}
