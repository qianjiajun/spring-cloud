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
        this("钱嘉俊", 27, "浙江省杭州市下城区朝晖街道潮王路18号", "951237941@qq.com");
    }

    public ConsumerDTO(String name) {
        this(name, 27, "浙江省杭州市下城区朝晖街道潮王路18号", "951237941@qq.com");
    }

    public ConsumerDTO(String name, Integer age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
