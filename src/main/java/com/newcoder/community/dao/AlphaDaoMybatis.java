package com.newcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("Mybatis")
@Primary
public class AlphaDaoMybatis implements AlphaDao{

    @Override
    public String select() {
        return "Hello Mybatis";
    }
}
