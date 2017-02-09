package com.zyd.info;

import com.zyd.db.Column;
import com.zyd.db.Table;

/**
 * Created by 张玉栋 on 2017/2/8.
 */

@Table(name = "student")
public class Student {


    @Column(name="id", primaryKey = true)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "address")
    private String address;
    @Column(name = "sex")
    private String sex;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }


}
