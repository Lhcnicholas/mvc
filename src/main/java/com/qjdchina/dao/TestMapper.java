package com.qjdchina.dao;

import org.apache.ibatis.annotations.Param;

public interface TestMapper {

	/**
	 * 插入
	 *
	 * @param name 名字
	 * @return id
	 */
	int insert(@Param("name") String name);
}
