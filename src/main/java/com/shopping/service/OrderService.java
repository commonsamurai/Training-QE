package com.shopping.service;

import java.util.List;

import com.shopping.entity.Order;

public interface OrderService {
	
	public static List<Order>  getAllOrder() {
		return null;
	}
	public static Order getOrderById(int orderId) {
		return null;
	}
	static boolean updateOrder( Order order, int orderId) {
		return false;
	}
	static boolean deleteOrder(int orderId) {
		return false;
	}
}
