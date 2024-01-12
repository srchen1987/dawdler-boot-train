package com.dawdler.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Order implements Serializable {
	/** 订单的唯一标识符 */
	private Integer orderId;

	/** 与顾客表相关联的外键，表示下订单的顾客 */
	private Integer customerId;

	/** 订单的总金额 */
	private BigDecimal totalAmount;

	/** 订单的状态 */
	private String status;

	/** 订单的创建时间，默认为当前时间戳 */
	private Integer createdAt;

	/** 订单的更新时间，默认为当前时间戳，当记录被更新时自动更新 */
	private Integer updatedAt;

	/**  */
	private static final long serialVersionUID = 1L;

	/**
	 * 获取[订单的唯一标识符]
	 * 
	 * @return orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * 设置[订单的唯一标识符]
	 * 
	 * @param orderId
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * 获取[与顾客表相关联的外键，表示下订单的顾客]
	 * 
	 * @return customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * 设置[与顾客表相关联的外键，表示下订单的顾客]
	 * 
	 * @param customerId
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * 获取[订单的总金额]
	 * 
	 * @return totalAmount
	 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	/**
	 * 设置[订单的总金额]
	 * 
	 * @param totalAmount
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * 获取[订单的状态]
	 * 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 设置[订单的状态]
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * 获取[订单的创建时间，默认为当前时间戳]
	 * 
	 * @return createdAt
	 */
	public Integer getCreatedAt() {
		return createdAt;
	}

	/**
	 * 设置[订单的创建时间，默认为当前时间戳]
	 * 
	 * @param createdAt
	 */
	public void setCreatedAt(Integer createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 获取[订单的更新时间，默认为当前时间戳，当记录被更新时自动更新]
	 * 
	 * @return updatedAt
	 */
	public Integer getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * 设置[订单的更新时间，默认为当前时间戳，当记录被更新时自动更新]
	 * 
	 * @param updatedAt
	 */
	public void setUpdatedAt(Integer updatedAt) {
		this.updatedAt = updatedAt;
	}
}