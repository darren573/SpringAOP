package com.darren.spring.bean;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;
/**
 * @author Administrator
 * 通知类，横切逻辑(通知功能：面向切面编程)
 */
@Component
public class Advices {
	/**
	 * shift+alt+j：自动注释
	 * 在业务逻辑的方法执行前执行它，具体可以是权限、通知……
	 * @param jp
	 */
	public void before(JoinPoint jp){
		System.out.println("----------前置通知----------");
		System.out.println(jp.getSignature().getName());
	}

	/**
	 * 在业务逻辑的方法执行后执行它，具体可以是日志，通知、异常处理……
	 * @param jp
	 */
	public void after(JoinPoint jp){
		System.out.println("----------最终通知----------");
	}
}
