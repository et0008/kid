package com.etoak.site.dao.daoImpl;


import com.etoak.site.dao.DBHelper;
import com.etoak.site.dao.IBaseDao;
import com.etoak.site.dao.TestDao;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;


/**
 * Created by yinyong on 2017/3/6.
 */

@Repository
public class TestDaoImpl extends DBHelper implements TestDao{

    @Override
    public Object save(Object entity) {
        IBaseDao ibasedao =  this.getiBaseDao();
        return ibasedao.save(entity);
    }

    @Override
    public void delete(Object entity) {
        this.getiBaseDao().delete(entity);
    }

    @Override
    public void update(Object entity) {
        this.getiBaseDao().update(entity);
    }

    @Override
    public Object findById(Class clazz, Serializable id) {
        return this.getiBaseDao().findById(clazz,id);
    }

    @Override
    public List findBySql(String sql) {
        return this.getiBaseDao().findBySql(sql);
    }

    @Override
    public List findBySql(String sql, Object[] value) {
        return this.getiBaseDao().findBySql(sql,value);
    }

    @Override
    public List queryByPage(String sql, int beginIndex, int pageSize) {
        return this.getiBaseDao().queryByPage(sql,beginIndex,pageSize);
    }
}
