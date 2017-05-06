package com.etoak.site.dao.daoImpl;

import com.etoak.site.dao.IBaseDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by yinyong on 2017/3/20.
 */
@Repository
public class IBaseDaoImpl implements IBaseDao {
    @Autowired
    private HibernateTemplate ht;

    @Override
    public Object findById(Class clazz, Serializable id) {
        return ht.get(clazz,id);
    }

    @Override
    public List findBySql(String sql) {
        return  ht.find(sql);
    }

    @Override
    public List findBySql(String sql, Object[] value) {
        return ht.find(sql,value);
    }

    @Override
    public List queryByPage(final String sql, final int beginIndex, final int pageSize) {
        return ht.executeFind(new HibernateCallback() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(sql).setFirstResult(beginIndex).setMaxResults(pageSize).list();
            }
        });
    }

    @Override
    public Object save(Object entity) {
        return ht.save(entity);
    }

    @Override
    public void update(Object entity) {
        ht.update(entity);
    }

    @Override
    public void delete(Object entity) {
        ht.delete(entity);
    }
}
