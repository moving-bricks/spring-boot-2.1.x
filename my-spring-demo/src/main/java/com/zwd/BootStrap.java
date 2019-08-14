package com.zwd;

import com.zwd.event.OrderEvent;
import com.zwd.listener.SendListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zwd
 * @since 2019-08-14
 **/


@SpringBootApplication
public class BootStrap {

	public static void main(String[] args)   {
		SpringApplication application = new SpringApplication(BootStrap.class);
		application.addListeners(new SendListener());
		application.run(args);

	}
}
