package com.zwd.listener;

import com.zwd.event.OrderEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author zwd
 * @since 2019-08-14
 **/
public class SendListener implements ApplicationListener<OrderEvent> {


	public void onApplicationEvent(OrderEvent event) {
		Object source = event.getSource();
		System.out.println("收到订单号"+ source +"，立即派送");
	}
}
