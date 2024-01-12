module order.web.api {
	exports com.dawdler.order.controller;
	exports com.dawdler.order.application;

	requires dawdler.boot.web;
	requires dawdler.client.plug.web;
	requires dawdler.core;
	requires dawdler.load.bean;
	requires order.api;
	requires jakarta.servlet;
	requires ch.qos.logback.classic;
	requires org.slf4j;
	requires dawdler.boot.classloader;
	requires dawdler.client;
	requires java.base;
	requires org.aspectj.weaver;
}