package com.etoak.site.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yinyong on 2017/3/20.
 */
public interface IBaseDao {

    Object findById(Class clazz, Serializable id);

    List findBySql(String sql);

    List findBySql(String sql,Object[] value);

    List queryByPage(String sql,int beginIndex,int pageSize);

    Object save(Object entity);

    void update(Object entity);

    void delete(Object entity);
}
