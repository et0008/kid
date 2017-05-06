package com.etoak.site.service.serviceImpl;

import com.etoak.site.bean.Kid;
import com.etoak.site.dao.TestDao;
import com.etoak.site.service.Testservice;
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
       Object o = testDaoImpl.save(kid);
        return o.toString();
    }

    @Override
    public void update(Kid kid) {
        testDaoImpl.update(kid);
    }

    @Override
    public void delete(Kid kid) {
        //Object o = testDaoImpl.findById(Kid.class, "4028df815ad18e9b015ad18f07ef0000");
        String sql = "from " + Kid.class.getName() + " where id = ?";

        Kid o = (Kid)testDaoImpl.findBySql(sql,new Object[]{"4028df815aeb6eea015aeb6f443f0000"});
        System.out.println(o);
        System.out.println(o);
        System.out.println(o);

    }
}
