package com.badilong.dynamicschedule.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badilong.dynamicschedule.bean.ScheduleJobLog;
import com.badilong.dynamicschedule.bean.ScheduleJobLogExample;
import com.badilong.dynamicschedule.dao.ScheduleJobLogMapper;
import com.badilong.dynamicschedule.service.ScheduleJobLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("scheduleJobLogService")
public class ScheduleJobLogServiceImpl implements ScheduleJobLogService {
	
	@Autowired
	private ScheduleJobLogMapper scheduleJobLogMapper;

	@Override
	public PageInfo queryPage(Map<String, Object> params) {
		Long jobId = Long.parseLong(params.get("jobId").toString());
		Integer page = Integer.parseInt(params.get("page").toString());
		Integer pageSize = Integer.parseInt(params.get("pageSize").toString());

		PageHelper.startPage(page,pageSize);
		ScheduleJobLogExample scheduleJobLogExample = new ScheduleJobLogExample();
		scheduleJobLogExample.createCriteria().andJobIdEqualTo(jobId);
		List<ScheduleJobLog> scheduleJobLogs = scheduleJobLogMapper.selectByExample(scheduleJobLogExample);
		PageInfo pageInfo = new PageInfo<>(scheduleJobLogs);
		return pageInfo;
	}
}
