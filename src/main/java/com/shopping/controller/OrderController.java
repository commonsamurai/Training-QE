package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.Order;
import com.shopping.service.OrderService;

@RestController
public class OrderController {
	
	
	@GetMapping("/getorder/{orderId}")
	public ResponseEntity<Order> getOrderById(@PathVariable int orderId){
		
			Order singleResult = OrderService.getOrderById(orderId);
		return new ResponseEntity<>(singleResult,HttpStatus.OK);
		
	}
	
	@GetMapping("/getallorders")
	public ResponseEntity<Order> getAllOrder(){
		
			List<Order> multiResult = OrderService.getAllOrder();
		return new ResponseEntity<>((Order) multiResult,HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Void> updateOrder(@RequestBody Order order, @PathVariable int orderId){
		if (order != null){
			OrderService.updateOrder(order, orderId);
			 return new ResponseEntity<>(HttpStatus.OK);
        } else {
        	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
	}
	
	@DeleteMapping("/cancel/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable int orderId){
		
			if(orderId != 0 && OrderService.deleteOrder(orderId)) {
                return new ResponseEntity<>(HttpStatus.ACCEPTED);
            }
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	
	
}
