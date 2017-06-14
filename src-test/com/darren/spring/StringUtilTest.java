package com.darren.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringUtilTest {
	private ApplicationContext context;
	private StringUtil stru;
	@Before
	public void initContext(){
		context = new ClassPathXmlApplicationContext("applicationContextAOP.xml");
		stru = context.getBean(StringUtil.class);
	}
	@Test
	public void testSay() {
		stru.say();
	}
}
