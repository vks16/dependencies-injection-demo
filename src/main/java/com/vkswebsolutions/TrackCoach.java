package com.vkswebsolutions;

public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 10 minutes on track";
    }

    @Override
    public String getFortune() {
        return null;
    }
}
