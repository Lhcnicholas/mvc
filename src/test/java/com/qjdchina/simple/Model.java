package com.qjdchina.simple;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Model {


	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date formatDate;

	private Date actualDate;

	public Date getFormatDate() {
		return formatDate;
	}

	public void setFormatDate(Date formatDate) {
		this.formatDate = formatDate;
	}

	public Date getActualDate() {
		return actualDate;
	}

	public void setActualDate(Date actualDate) {
		this.actualDate = actualDate;
	}

	public static void main(String[] args) {
		Model model = new Model();
		model.setFormatDate(new Date());
		model.setActualDate(new Date());

		System.out.println(JSON.toJSONString(model));
	}
}
