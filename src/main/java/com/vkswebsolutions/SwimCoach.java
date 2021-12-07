package com.vkswebsolutions;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;
    private final FortuneService fortuneService;
    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        System.out.println(this.email);
        System.out.println(this.team);
        return "Swim for 30 minutes";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }


}
