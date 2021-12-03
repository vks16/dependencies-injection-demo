package com.vkswebsolutions;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Bat for 30 minutes";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
