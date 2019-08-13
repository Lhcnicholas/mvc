package com.qjdchina.interceptors;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lhc
 */
@Component
public class MyExceptionHandler implements HandlerExceptionResolver {

	private static final Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		FastJsonJsonView view = new FastJsonJsonView();
		Map<String, Object> errorInfoMap = new HashMap<>();
		errorInfoMap.put("code","1");
		errorInfoMap.put("message", "系统错误");
		view.setAttributesMap(errorInfoMap);
		logger.info("异常处理器执行");

		return new ModelAndView(view);
	}
}
