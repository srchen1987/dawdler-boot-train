package com.dawdler.order.service.impl;

import java.util.List;

import com.anywide.dawdler.core.result.BaseResult;
import com.anywide.dawdler.core.result.PageResult;
import com.anywide.dawdler.serverplug.db.annotation.DBTransaction;
import com.anywide.dawdler.serverplug.db.annotation.DBTransaction.MODE;
import com.anywide.dawdler.serverplug.db.annotation.Repository;
import com.anywide.dawdler.serverplug.load.bean.Page;
import com.dawdler.order.entity.Order;
import com.dawdler.order.mapper.OrderMapper;
import com.dawdler.order.service.OrderService;

public class OrderServiceImpl implements OrderService {
	@Repository
	private OrderMapper orderMapper;

	@Override
	@DBTransaction(mode = MODE.readOnly)
	public BaseResult<Order> selectByPrimaryKey(Integer orderId) {
		Order order = orderMapper.selectByPrimaryKey(orderId);
		BaseResult<Order> baseResult = new BaseResult<>(order);
		return baseResult;
	}

	@Override
	@DBTransaction(mode = MODE.readOnly)
	public PageResult<List<Order>> selectPageList(Order order, Integer pageOn, Integer row) {
		int rowCount = orderMapper.selectPageListCount(order);
		Page page = new Page(pageOn, row);
		page.setRowCountAndCompute(rowCount);
		List<Order> orderList = orderMapper.selectPageList(order, page);
		PageResult<List<Order>> pageResult = new PageResult<>(orderList, page);
		return pageResult;
	}

	@Override
	@DBTransaction(mode = MODE.forceReadOnWrite)
	public int updateByPrimaryKeySelective(Order order) {
		return orderMapper.updateByPrimaryKeySelective(order);
	}

	@Override
	@DBTransaction(mode = MODE.forceReadOnWrite)
	public int insertSelective(Order order) {
		return orderMapper.insertSelective(order);
	}

	@Override
	@DBTransaction(mode = MODE.forceReadOnWrite)
	public int deleteByPrimaryKey(Integer orderId) {
		return orderMapper.deleteByPrimaryKey(orderId);
	}
}