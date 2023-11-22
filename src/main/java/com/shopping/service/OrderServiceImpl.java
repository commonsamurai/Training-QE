package com.shopping.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.entity.Order;
import com.shopping.exceptions.ResourceNotFoundException;
import com.shopping.repository.OrderRepository;

@Service
public class OrderServiceImpl {
	
	
	@Autowired
	private OrderRepository orderRepo;
	
	
	public Optional<Order> getOrderById(int orderId) throws ResourceNotFoundException {
		return Optional.of(orderRepo.findById(orderId).
				orElseThrow(()-> new ResourceNotFoundException("Order id: " + orderId+ "is not found")));
		
	}
	
	public List<Order> getAllOrder() throws ResourceNotFoundException {
		 List<Order> orderResult  =  orderRepo.findAll();
		 if(!orderResult.isEmpty()) {
			 return orderResult;
		 }
		 else {
			 throw new ResourceNotFoundException("No orders avilable");
		 }
	}
	
	public boolean delete(int orderId) throws ResourceNotFoundException {
		if(orderId != 0) {
			orderRepo.deleteById(orderId);
			return true;
		}else {
			throw new ResourceNotFoundException("Order not found");
		}
	}
	
	public boolean update(Order order, int orderId) {   
			if(orderRepo.existsById(orderId)) {
				
			orderRepo.deleteById(orderId);
			
			 int orderId1 = order.getOrderId();
			 String orderDate = order.getOrderDate();
			 int customerId = order.getCustomerId();
			 int amountPaid = order.getAmountPaid();
			 String modeofPayment = order.getModeofPayment();
			 String orderStatus = order.getOrderStatus();
			 int quantity = order.getQuantity();
			 
			 Order orderobj = new Order(orderId1, orderDate, customerId, amountPaid, modeofPayment, orderStatus, quantity);
			 
			 orderRepo.save(orderobj);
	    }
			else {
				int orderId1 = order.getOrderId();
				 String orderDate = order.getOrderDate();
				 int customerId = order.getCustomerId();
				 int amountPaid = order.getAmountPaid();
				 String modeofPayment = order.getModeofPayment();
				 String orderStatus = order.getOrderStatus();
				 int quantity = order.getQuantity();
				 
				 Order orderobj = new Order(orderId1, orderDate, customerId, amountPaid, modeofPayment, orderStatus, quantity);
				 
				 orderRepo.save(orderobj);
			}
			return true;

			
	}
	}

