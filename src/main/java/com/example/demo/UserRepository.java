package com.example.demo;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import com.example.demo.jooq.Tables;

@Repository
public class UserRepository {

    private final DSLContext dsl;

    public UserRepository(DSLContext dsl) {
        this.dsl = dsl;
    }

    /*
     * 全件取得 (SELECT * FROM users)
     */
    public List<User> findAll() {
        return dsl.selectFrom(Tables.USERS).fetchInto(User.class);
    }

    /*
     * 保存(INSERT INFTO usrs (name) VALUES (...))
     */
    public void save(User user) {
        dsl.insertInto(Tables.USERS).set(Tables.USERS.NAME, user.getName()).execute();
    }
}
