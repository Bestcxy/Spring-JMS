package com.bestcxx.stu.jms.service.impl;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.JmsUtils;
import org.springframework.stereotype.Service;

import com.bestcxx.stu.jms.service.JmsStringReceiveService;

@Service
public class JmsStringReceiveServiceImpl implements JmsStringReceiveService {

	@Resource(name="jmsStringTemplate")
	JmsTemplate jmsTemplate;

	@Override
	public String receiveString() {
		// TODO Auto-generated method stub
		return (String) jmsTemplate.receiveAndConvert();//本句代码可以取代下面注释的代码
		
		/*ObjectMessage receiveMessage=(ObjectMessage) jmsTemplate.receive();
		try {
			return (String) receiveMessage.getObject();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			throw JmsUtils.convertJmsAccessException(e);//抛出转化后的异常
		}*/
	}

}
