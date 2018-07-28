package com.gateman.girl.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "girl") //means it will get properties value from config file(application.yml):  item "girl"
public class GrilProperty {

    private String cupSize;
    private String age;


    public String getCupSize() {
        return cupSize;
    }

    public String getAge() {
        return age;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GrilProperty{" +
                "cupSize='" + cupSize + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
