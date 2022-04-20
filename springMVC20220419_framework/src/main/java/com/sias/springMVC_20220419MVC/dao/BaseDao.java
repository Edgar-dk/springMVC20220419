package com.sias.springMVC_20220419MVC.dao;

import com.sias.springMVC_20220419MVC.entity.BaseEntity;

import java.util.List;

/**
 * @Author: zyg
 * @License: (C) Copyright 2005-2019, xxx Corporation Limited.
 * @Contact: ytzhaof@isoftstone.com
 * @Date: 2022/4/19 8:22
 * @Version: 1.0
 * @Description:
 * 所有持久层DAO 接口继承该接口
 */
public interface BaseDao<T extends BaseEntity> {
    public int saveEntity(T entity);
    public int updateEntity(T entity);
    public int deleteEntity(Object id);
    public List<T> selectALL();
    public T selectById(Object id);
}
