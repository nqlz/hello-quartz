package com.nqlz.helloquartz.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 功能描述:
 *
 * @author: MR.zt
 * @date: 2019/8/28 10:18
 */
@Slf4j
public class MyJob extends QuartzJobBean {


    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        log.info("执行任务");

    }


}
