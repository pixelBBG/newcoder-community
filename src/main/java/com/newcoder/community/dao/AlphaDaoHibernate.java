package com.newcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("Hibernate")
public class AlphaDaoHibernate implements  AlphaDao{
    @Override
    public String select() {
        return "Hello Hibernate";
    }
}
