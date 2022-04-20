package com.sias.springMVC_20220419MVC.serviceImpl;

import com.sias.springMVC_20220419MVC.dao.EmpDao;
import com.sias.springMVC_20220419MVC.entity.EmpEntity;
import com.sias.springMVC_20220419MVC.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: zyg
 * @License: (C) Copyright 2005-2019, xxx Corporation Limited.
 * @Contact: ytzhaof@isoftstone.com
 * @Date: 2022/4/19 9:00
 * @Version: 1.0
 * @Description:
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;

    public int saveEmp(EmpEntity entity) {
        return empDao.saveEntity(entity);
    }
}
