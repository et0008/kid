package com.etoak.site.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yinyong on 2017/3/7.
 */
@Entity
@Table(name="KID")
public class Kid implements Serializable{
    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name="generator",strategy = "uuid.hex")
    @Column(name = "id")
    private String id;
    @Column(name = "name",length = 30)
    private String name;
    @Column(name = "age",length = 3)
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
