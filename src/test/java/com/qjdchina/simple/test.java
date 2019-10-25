package com.qjdchina.simple;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Date;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/5/14
 **/
public class test {
	public static void main(String[] args) {
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("'''abc'");
		String value = expression.getValue(String.class);
		System.out.println(value);
	}
}
