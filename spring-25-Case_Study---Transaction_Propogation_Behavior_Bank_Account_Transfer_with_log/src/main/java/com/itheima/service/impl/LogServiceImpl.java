package com.itheima.service.impl;

import com.itheima.dao.LogDao;
import com.itheima.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Mendy
 * @create 2023-06-26 20:51
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;


    public void log(String out, String in, Double money ) {
        logDao.log("转账操作由" + out + "到" + in + ", 金额："+money);
    }
}

