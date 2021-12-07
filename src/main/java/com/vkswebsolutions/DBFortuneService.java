package com.vkswebsolutions;

import org.springframework.stereotype.Component;

@Component("db")
public class DBFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Getting from db";
    }
}
