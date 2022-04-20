package com.sias.springMVC_20220419MVC.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * @Author: zyg
 * @License: (C) Copyright 2005-2019, xxx Corporation Limited.
 * @Contact: ytzhaof@isoftstone.com
 * @Date: 2022/4/4 10:16
 * @Version: 1.0
 * @Description:
create table emp(empno int(15) primary key auto_increment, ename varchar(20),
job varchar(20),mgr int(15),hiredate date,sal double(15,2),comm double(15,2),deptno int(3)
);
 */
public class EmpEntity extends  BaseEntity {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private BigDecimal sal;
    private BigDecimal comm;
    private Integer  deptno;

    private DeptEntity deptEntity;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }



    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public DeptEntity getDeptEntity() {
        return deptEntity;
    }

    public void setDeptEntity(DeptEntity deptEntity) {
        this.deptEntity = deptEntity;
    }
}
