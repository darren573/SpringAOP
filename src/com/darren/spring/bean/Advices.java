package com.darren.spring.bean;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;
/**
 * @author Administrator
 * ֪ͨ�࣬�����߼�(֪ͨ���ܣ�����������)
 */
@Component
public class Advices {
	/**
	 * shift+alt+j���Զ�ע��
	 * ��ҵ���߼��ķ���ִ��ǰִ���������������Ȩ�ޡ�֪ͨ����
	 * @param jp
	 */
	public void before(JoinPoint jp){
		System.out.println("----------ǰ��֪ͨ----------");
		System.out.println(jp.getSignature().getName());
	}

	/**
	 * ��ҵ���߼��ķ���ִ�к�ִ�����������������־��֪ͨ���쳣������
	 * @param jp
	 */
	public void after(JoinPoint jp){
		System.out.println("----------����֪ͨ----------");
	}
}
