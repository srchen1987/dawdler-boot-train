package com.dawdler.order.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.anywide.dawdler.serverplug.load.bean.Page;
import com.dawdler.order.entity.Order;

public interface OrderMapper {
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
	 * @param row
	 */
	int insert(Order row);

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
	 * @param row
	 */
	int insertSelective(Order row);

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
	Order selectByPrimaryKey(Integer orderId);

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
	 * @param row
	 */
	int updateByPrimaryKeySelective(Order row);

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
	 * @param row
	 */
	int updateByPrimaryKey(Order row);

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
	 * @param order
	 */
	int selectPageListCount(Order order);

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
	 * @param page
	 */
	List<Order> selectPageList(@Param("order") Order order, @Param("page") Page page);
}