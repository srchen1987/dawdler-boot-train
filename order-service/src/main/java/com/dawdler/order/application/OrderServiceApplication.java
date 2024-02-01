package com.dawdler.order.application;

import com.anywide.dawdler.boot.server.annotation.DawdlerBootApplication;
import com.anywide.dawdler.boot.server.starter.DawdlerServerApplication;

@DawdlerBootApplication(serviceName = "order-service")
public class OrderServiceApplication {
	public static void main(String[] args) throws Exception {
		DawdlerServerApplication.run(OrderServiceApplication.class, args);
	}
}
