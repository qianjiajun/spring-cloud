package com.jack.core.entity;

/**
 * @Author qjj
 * @Date 2020-08-19 15:21
 * @Version 1.0
 * @Class Producer.java
 * @Desc 生产者
 */
public class Producer {

    private String name;
    private int age;
    private String add;
    private String email;

    public Producer() {
        this.name = "name";
        this.age = 12;
        this.add = "北京市历史互通";
        this.email = "6666.qq.com";
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
