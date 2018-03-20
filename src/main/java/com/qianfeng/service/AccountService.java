package com.qianfeng.service;

import com.qianfeng.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    @Autowired
    private AccountDAO accountDAO;

    @Transactional
    public void transferMoney(){
        accountDAO.getMoney("zhangsan",1000);
        accountDAO.saveMoney("lisi",1000);
    }
}
