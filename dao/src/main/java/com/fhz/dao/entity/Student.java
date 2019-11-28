package com.fhz.dao.entity;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -531509630958473232L;

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}