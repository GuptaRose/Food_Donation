package com.abc.ANNAPURNAFOODDONATION;

public class model {
    String name,type,description,userid,phone,city;

    public model() {

    }

    public model(String name, String type, String description, String userid,String phone,String city) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.userid = userid;
        this.phone=phone;
        this.city=city;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
