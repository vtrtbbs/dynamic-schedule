package com.badilong.dynamicschedule.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.badilong.dynamicschedule.bean.ScheduleJob;
import com.badilong.dynamicschedule.bean.ScheduleJobExample;

public interface ScheduleJobMapper {
	
	long countByExample(ScheduleJobExample example);

    int deleteByExample(ScheduleJobExample example);

    int deleteByPrimaryKey(Long jobId);

    int insert(ScheduleJob record);

    int insertSelective(ScheduleJob record);

    List<ScheduleJob> selectByExample(ScheduleJobExample example);

    ScheduleJob selectByPrimaryKey(Long jobId);

    int updateByExampleSelective(@Param("record") ScheduleJob record, @Param("example") ScheduleJobExample example);

    int updateByExample(@Param("record") ScheduleJob record, @Param("example") ScheduleJobExample example);

    int updateByPrimaryKeySelective(ScheduleJob record);

    int updateByPrimaryKey(ScheduleJob record);
}
