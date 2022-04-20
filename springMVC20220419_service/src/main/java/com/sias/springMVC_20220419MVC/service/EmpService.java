package com.sias.springMVC_20220419MVC.service;

import com.sias.springMVC_20220419MVC.entity.EmpEntity;
import org.springframework.stereotype.Service;

/**
 * @Author: zyg
 * @License: (C) Copyright 2005-2019, xxx Corporation Limited.
 * @Contact: ytzhaof@isoftstone.com
 * @Date: 2022/4/19 9:00
 * @Version: 1.0
 * @Description:
 */

public interface EmpService {
    public int saveEmp(EmpEntity entity);
}
