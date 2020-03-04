package com.hern.service;

import com.github.pagehelper.PageInfo;
import com.hern.entity.Order;
import com.hern.util.OrderSearchVO;
import com.hern.util.OrderVO;

import java.util.List;

public interface IOrderService {
	Order takeOrder(Order order);
	List<Order> findOrdersByUserIdAndState(Integer userId, Integer state);
	Integer receiveOrder(String orderId);
	Integer deliverOrder(String orderId, String expressNo);
	Integer evaOrder(String orderId);
	Integer deleteOrder(String orderId);
	PageInfo<Order> findOrdersBySplitPage(Integer page, Integer limit, OrderSearchVO vo);
	Integer updateOrder(Order order);
	Order findOrderById(String id);
	List<OrderVO> findTotalMoneyByMonth(Integer limit);
	Integer findTotalOrder();
	Integer findTotalDeliverOrder();
	Integer payForOrder(String orderId);
}
