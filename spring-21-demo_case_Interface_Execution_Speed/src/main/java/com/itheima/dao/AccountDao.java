package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Mendy
 * @create 2023-06-26 9:43
 */
public interface AccountDao {

    @Insert("insert into spring_db.tbl_account(name,money)values(#{name}，#{money})")
    void save(Account account);

    @Delete("delete from spring_db.tbl_account where id = #{id} ")
    void delete(Integer id);

    @Update("update spring_db.tbl_account set name = #{name} , money = #{money} where id = #{id} ")
    void update(Account account);

    @Select("select * from spring_db.tbl_account")
    List<Account> findAll();

    @Select("select * from spring_db.tbl_account where id = #{id} ")
    Account findById(Integer id);
}

