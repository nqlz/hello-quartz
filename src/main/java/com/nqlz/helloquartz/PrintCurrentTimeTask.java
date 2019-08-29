package com.nqlz.helloquartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

//@Component
public class PrintCurrentTimeTask {

    @Scheduled(cron = "0/5 * * * * ?")
    public void ptintCurrenTime(){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
