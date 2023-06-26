package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @author Mendy
 * @create 2023-06-26 9:44
 */
public interface AccountService {
    void save(Account account);
    void delete(Integer id);
    void update(Account account);
    List<Account> findAll();
    Account findById(Integer id);
}

