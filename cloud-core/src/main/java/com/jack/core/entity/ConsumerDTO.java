package com.jack.core.entity;

/**
 * @Author qjj
 * @Date 2020-08-19 15:21
 * @Version 1.0
 * @Class Consumer.java
 * @Desc 消费者
 */
public class ConsumerDTO {

    private String name;
    private Integer age;
    private String address;
    private String email;

    public ConsumerDTO() {
        this.name = "钱嘉俊";
        this.age = 27;
        this.address = "浙江省杭州市下城区朝晖街道潮王路18号";
        this.email = "951237941@qq.com";
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
