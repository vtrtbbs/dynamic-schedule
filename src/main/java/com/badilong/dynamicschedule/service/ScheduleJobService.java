package com.badilong.dynamicschedule.service;

import java.util.List;
import java.util.Map;

import com.badilong.dynamicschedule.bean.ScheduleJob;
import com.github.pagehelper.PageInfo;

public interface ScheduleJobService {
	PageInfo queryPage(Map<String, Object> params);

	/**
	 * 保存定时任务
	 */
	void save(ScheduleJob scheduleJob);

	/**
	 * 更新定时任务
	 */
	void update(ScheduleJob scheduleJob);

	/**
	 * 批量删除定时任务
	 */
	void deleteBatch(List<Long> jobIds);

	/**
	 * 批量更新定时任务状态
	 */
	int updateBatch(List<Long> jobIds, int status);

	/**
	 * 立即执行
	 */
	void run(List<Long> jobIds);

	/**
	 * 暂停运行
	 */
	void pause(List<Long> jobIds);

	/**
	 * 恢复运行
	 */
	void resume(List<Long> jobIds);
}