package com.qianfeng.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 访问db_1704数据库
 */
@Repository
public class AccountDAO {

    @Resource(name="jdbcTemplate1704")
    private JdbcTemplate jdbcTemplate1704;

    @Resource(name = "jdbcTemplate1706")
    private JdbcTemplate jdbcTemplate1706;

    /**
     * 取钱
     * @param username
     * @param money
     */
    public void getMoney(String username,int money){
        jdbcTemplate1704.execute("update tb_account set account_money=account_money-"+money+" where account_name = '" + username +"'");
    }

    /**
     * 存钱
     * @param username
     * @param money
     */
    public void saveMoney(String username,int money){
        jdbcTemplate1706.execute("update tb_account set account_money=account_money+"+money+" where account_name = '" + username + "'");
        throw new NullPointerException("空指针");
    }



}
