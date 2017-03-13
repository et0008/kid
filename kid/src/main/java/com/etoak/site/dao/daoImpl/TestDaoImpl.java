package com.etoak.site.dao.daoImpl;

import com.etoak.site.bean.Kid;
import com.etoak.site.dao.TestDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;


/**
 * Created by yinyong on 2017/3/6.
 */

@Repository
public class TestDaoImpl implements TestDao {

//    @Autowired(required=false)
    @Autowired
    private HibernateTemplate ht;

    @Override
    public String addTest(Kid kid) {
        ht.save(kid);
        return "111";
    }
}
