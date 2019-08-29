package com.nqlz.helloquartz.config;

import com.nqlz.helloquartz.job.MyJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述:
 *
 * @author: MR.zt
 * @date: 2019/8/28 10:20
 */
@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail myJobDetail() {

        JobDetail detail = JobBuilder.newJob(MyJob.class)
                .storeDurably()
                .withIdentity("myjob1", "group1").build();
        return detail;
    }

    /**
     *
     * @return
     */
    @Bean
    public Trigger myTrigger1(){
        SimpleTrigger trigger = TriggerBuilder.newTrigger()
                .startNow()
                .withIdentity("trigger1", "group1")
                .forJob(myJobDetail())
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(5)
                        .repeatForever()).build();
        return trigger;
    }

}
