package com.etoak.site.dao;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by yinyong on 2017/3/20.
 */
public class DBHelper {
    @Autowired
    private  IBaseDao iBaseDao;

    public IBaseDao getiBaseDao() {
        return iBaseDao;
    }

    public void setiBaseDao(IBaseDao iBaseDao) {
        this.iBaseDao = iBaseDao;
    }
}
