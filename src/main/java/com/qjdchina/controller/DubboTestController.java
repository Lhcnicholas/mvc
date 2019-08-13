package com.qjdchina.controller;

import com.qjdchina.clms.service.MakeLoansService;
import com.qjdchina.commons.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lhc
 */
@Controller
@RequestMapping("dubbo")
public class DubboTestController {

	@Autowired
	private MakeLoansService makeLoansService;

	@RequestMapping("1")
	public void test1() {
		Result<Boolean> loanRepaying = makeLoansService.isLoanRepaying("201907100100020007MMBL0000000021");
		System.out.println(loanRepaying.getDataModel());
	}
}
