package com.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controllertest {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;

    @RequestMapping("/boot")
    public Map boottest() {
        Map map = new HashMap();
        map.put("姓名", name);
        map.put("年龄", age);
        return map;
    }

}
