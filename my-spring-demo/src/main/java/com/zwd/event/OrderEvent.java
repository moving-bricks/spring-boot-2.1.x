package com.zwd.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author zwd
 * @since 2019-08-14
 **/
public class OrderEvent extends ApplicationEvent {

	public OrderEvent(Object source) {
		super(source);
	}
}
