module order.api {
	requires java.base;
	requires dawdler.load.bean;
	requires dawdler.core;

	exports com.dawdler.order.entity;

	exports com.dawdler.order.service;

	opens com.dawdler.order.entity;
}