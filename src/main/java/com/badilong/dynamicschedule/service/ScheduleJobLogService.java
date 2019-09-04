package com.badilong.dynamicschedule.service;

import java.util.Map;

import com.github.pagehelper.PageInfo;

public interface ScheduleJobLogService {
	
	PageInfo queryPage(Map<String, Object> params);
}
