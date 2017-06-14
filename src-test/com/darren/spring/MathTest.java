package com.darren.spring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MathTest {
	private ApplicationContext context;
	private Math math;
	@Before
	public void initContext(){
		context = new ClassPathXmlApplicationContext("applicationContextAOP.xml");
		math = context.getBean(Math.class);
	}
	@Test
	public void testAdd() {
		math.add(1, 2);
	}

	@Test
	public void testSub() {
		fail("Not yet implemented");
	}

	@Test
	public void testMut() {
		fail("Not yet implemented");
	}

	@Test
	public void testDiv() {
		fail("Not yet implemented");
	}


}
