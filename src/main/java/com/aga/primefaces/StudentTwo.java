package com.aga.primefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {

    private String fistName;
    private String secondName;
    private String country;

    public StudentTwo(){}
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
