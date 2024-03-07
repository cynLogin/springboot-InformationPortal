package com.example.springbootdemo.backUp;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Task {
    private final backUpMain backUp;
    public Task(backUpMain backUp){
        this.backUp=backUp;
    }
    @Scheduled(cron = "0 0 2 * * *" )
    public void backUpDaily(){
        backUp.backUpMainMethod();
    }
}
