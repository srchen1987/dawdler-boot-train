package com.dawdler.order.controller;

import java.util.List;

import com.anywide.dawdler.clientplug.web.annotation.Controller;
import com.anywide.dawdler.clientplug.web.annotation.RequestMapping;
import com.anywide.dawdler.clientplug.web.annotation.RequestMapping.RequestMethod;
import com.anywide.dawdler.clientplug.web.annotation.ResponseBody;
import com.anywide.dawdler.core.annotation.Service;
import com.anywide.dawdler.core.result.BaseResult;
import com.anywide.dawdler.core.result.PageResult;
import com.dawdler.order.entity.Order;
import com.dawdler.order.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Service
	private OrderService orderService;

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
	 * @param pageOn
	 * @param order
	 */
	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public PageResult<List<Order>> list(Integer pageOn, Order order) {
		int row = 10;
		return orderService.selectPageList(order, pageOn, row);
	}

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
	@ResponseBody
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public BaseResult<Order> info(Integer orderId) {
		return orderService.selectByPrimaryKey(orderId);
	}

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
	@ResponseBody
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public BaseResult<Void> update(Order order) {
		int count = orderService.updateByPrimaryKeySelective(order);
		BaseResult<Void> baseResult;
		if (count > 0) {
			baseResult = new BaseResult<>("更新成功!", true);
		} else {
			baseResult = new BaseResult<>("更新失败!", false);
		}
		return baseResult;
	}

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
	@ResponseBody
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public BaseResult<Void> insert(Order order) {
		int count = orderService.insertSelective(order);
		BaseResult<Void> baseResult;
		if (count > 0) {
			baseResult = new BaseResult<>("插入成功!", true);
		} else {
			baseResult = new BaseResult<>("插入失败!", false);
		}
		return baseResult;
	}

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
	@ResponseBody
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public BaseResult<Void> delete(Integer orderId) {
		int count = orderService.deleteByPrimaryKey(orderId);
		BaseResult<Void> baseResult;
		if (count > 0) {
			baseResult = new BaseResult<>("删除成功!", true);
		} else {
			baseResult = new BaseResult<>("删除失败!", false);
		}
		return baseResult;
	}
}