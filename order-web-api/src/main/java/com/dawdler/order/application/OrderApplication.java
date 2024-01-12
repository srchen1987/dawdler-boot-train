package com.dawdler.order.application;

import com.anywide.dawdler.boot.web.annotation.DawdlerBootApplication;
import com.anywide.dawdler.boot.web.starter.DawdlerWebApplication;

@DawdlerBootApplication
public class OrderApplication {
	public static void main(String[] args) throws Throwable {
		DawdlerWebApplication.run(OrderApplication.class, args);
	}
}