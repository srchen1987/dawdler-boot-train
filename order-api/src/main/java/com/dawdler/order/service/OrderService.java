package com.dawdler.order.service;

import java.util.List;

import com.anywide.dawdler.core.annotation.RemoteService;
import com.anywide.dawdler.core.result.BaseResult;
import com.anywide.dawdler.core.result.PageResult;
import com.dawdler.order.entity.Order;

@RemoteService("order-service")
public interface OrderService {
	/**
	 * 
	 * 查询
	 * 
	 * @Copyright dawdler 2024-1-12
	 *            <p>
	 *            Company: dawdler
	 *            </p>
	 * @author srchen
	 * @date 2024年1月12日 下午5:24:42
	 * @version 1.0
	 * @param orderId 订单的唯一标识符
	 */
	BaseResult<Order> selectByPrimaryKey(Integer orderId);

	/**
	 * 
	 * 查询列表
	 * 
	 * @Copyright dawdler 2024-1-12
	 *            <p>
	 *            Company: dawdler
	 *            </p>
	 * @author srchen
	 * @date 2024年1月12日 下午5:24:42
	 * @version 1.0
	 * @param order
	 * @param pageOn
	 * @param row
	 */
	PageResult<List<Order>> selectPageList(Order order, Integer pageOn, Integer row);

	/**
	 * 
	 * 更新
	 * 
	 * @Copyright dawdler 2024-1-12
	 *            <p>
	 *            Company: dawdler
	 *            </p>
	 * @author srchen
	 * @date 2024年1月12日 下午5:24:42
	 * @version 1.0
	 * @param order
	 */
	int updateByPrimaryKeySelective(Order order);

	/**
	 * 
	 * 插入
	 * 
	 * @Copyright dawdler 2024-1-12
	 *            <p>
	 *            Company: dawdler
	 *            </p>
	 * @author srchen
	 * @date 2024年1月12日 下午5:24:42
	 * @version 1.0
	 * @param order
	 */
	int insertSelective(Order order);

	/**
	 * 
	 * 删除
	 * 
	 * @Copyright dawdler 2024-1-12
	 *            <p>
	 *            Company: dawdler
	 *            </p>
	 * @author srchen
	 * @date 2024年1月12日 下午5:24:42
	 * @version 1.0
	 * @param orderId 订单的唯一标识符
	 */
	int deleteByPrimaryKey(Integer orderId);
}