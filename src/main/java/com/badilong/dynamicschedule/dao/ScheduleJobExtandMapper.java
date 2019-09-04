package com.badilong.dynamicschedule.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ScheduleJobExtandMapper {
	int updateBatch(@Param("ids") List ids,@Param("status") int status);

    int deleteBatch(@Param("ids") List<Long> ids);
}
