package com.etoak.site.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by yinyong on 2017/3/7.
 */
@Entity
@Table(name="KID")
public class Kid implements Serializable{
    @Column(length = 36)
    private String id;
    @Column(length = 30)
    private String name;
    @Column(length = 3)
    private String age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
