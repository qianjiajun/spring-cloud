package com.jack.core.entity;

/**
 * @Author qjj
 * @Date 2020-08-19 15:21
 * @Version 1.0
 * @Class Producer.java
 * @Desc 生产者
 */
public class ProducerDTO {

    private String name;
    private Integer age;
    private String address;
    private String email;

    public ProducerDTO() {
        this.name = "喵";
        this.age = 25;
        this.address = "河北省邢台市桥西区泉西街道燕云台32号";
        this.email = "2134923474@qq.com";
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
