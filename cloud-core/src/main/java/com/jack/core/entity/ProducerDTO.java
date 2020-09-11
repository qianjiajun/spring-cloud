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
        this("隔壁班的喵会长", 25, "河北省邢台市桥西区泉西街道燕云台32号", "2134923474@qq.com");
    }

    public ProducerDTO(String name) {
        this(name, 25, "河北省邢台市桥西区泉西街道燕云台32号", "2134923474@qq.com");
    }

    public ProducerDTO(String name, Integer age, String address, String email) {
        this.name = null == name || "".equals(name.trim()) ? "隔壁班的喵会长" : name;
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
        return "Producer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
