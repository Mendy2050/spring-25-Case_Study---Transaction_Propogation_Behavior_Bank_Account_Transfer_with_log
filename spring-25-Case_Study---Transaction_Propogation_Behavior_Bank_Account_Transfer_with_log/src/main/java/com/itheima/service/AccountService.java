package com.itheima.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @author Mendy
 * @create 2023-06-26 19:41
 */
public interface AccountService {
    @Transactional
    public void transfer(String out, String in, Double money) throws IOException;
}

