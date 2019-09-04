package com.badilong.dynamicschedule.task;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component("test2task")
@Slf4j
public class TestInterfaceTask {
	
	public void consoleLog(){
        System.out.println("通过测试接口 来控制定时任务");
    }
}
