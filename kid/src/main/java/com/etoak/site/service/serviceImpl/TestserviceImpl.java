package com.etoak.site.service.serviceImpl;

import com.etoak.site.bean.Kid;
import com.etoak.site.dao.TestDao;
import com.etoak.site.service.Testservice;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by yinyong on 2017/3/6.
 */
@Service("testservice")
public class TestserviceImpl implements Testservice {
    @Resource
    TestDao testDaoImpl;

    @Override
    public String addTest(Kid kid) {
//        return "11111";
        return testDaoImpl.addTest(kid);
    }
}
