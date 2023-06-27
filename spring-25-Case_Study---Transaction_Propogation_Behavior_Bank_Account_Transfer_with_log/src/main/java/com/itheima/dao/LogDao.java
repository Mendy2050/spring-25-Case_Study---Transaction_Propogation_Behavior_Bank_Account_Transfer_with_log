package com.itheima.dao;

import org.apache.ibatis.annotations.Insert;

/**
 * @author Mendy
 * @create 2023-06-26 20:49
 */
public interface LogDao {
    @Insert("insert into spring_db.tbl_log (info,createDate) values(#{info},now())")
    void log(String info);
}

