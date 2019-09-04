package com.badilong.dynamicschedule.utils;

import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ReflectionUtils;

import com.badilong.dynamicschedule.exception.GenericException;

public class ScheduleRunnable implements Runnable {
	
	private Object target;
	private Method method;
	private String params;

	public ScheduleRunnable(String beanName, String methodName, String params) throws NoSuchMethodException, SecurityException {
		this.target = SpringContextUtils.getBean(beanName);
		this.params = params;

		if(StringUtils.isNotBlank(params)){
			this.method = target.getClass().getDeclaredMethod(methodName, String.class);
		}else{
			this.method = target.getClass().getDeclaredMethod(methodName);
		}
	}
	
	@Override
	public void run() {
		try {
			ReflectionUtils.makeAccessible(method);
			if(StringUtils.isNotBlank(params)){
				method.invoke(target, params);
			}else{
				method.invoke(target);
			}
		}catch (java.lang.Exception e) {
			throw new GenericException("执行定时任务失败", e);
		}

	}

}
