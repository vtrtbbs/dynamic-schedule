package com.badilong.dynamicschedule.task;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component("testTask")
@Slf4j
public class TestTask {
	
	public void test(String params){
		System.out.println("我是带参数的test方法，正在被执行，参数为：" + params);

		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}


	public void test2(){
		System.out.println("我是不带参数的test2方法，正在被执行");
	}
}
