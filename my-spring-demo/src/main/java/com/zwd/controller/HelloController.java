package com.zwd.controller;

import com.zwd.event.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwd
 * @since 2019-08-14
 **/
@RestController
public class HelloController {

	@Autowired
	private ApplicationEventPublisher eventPublisher;
	@GetMapping(value = "/")
	public void index() {
		eventPublisher.publishEvent(new OrderEvent("34324234234"));
	}
}
