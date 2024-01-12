module order.service {
	exports com.dawdler.order.service.impl;
	exports com.dawdler.order.mapper;
	exports com.dawdler.product.application;

	requires dawdler.boot.server;
	requires dawdler.load.bean;
	requires dawdler.server.plug.db;
	requires order.api;
	requires org.mybatis;
}