package com.shopping.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "orders")
public class Order {
	
	@Id
	@NotBlank(message = "ID is valid")
	private int orderId;
	@Pattern(regexp = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$", message = "date format is incorrect")
	private String orderDate;
	@NotBlank(message = "ID is valid")
	private int customerId;
	@NotNull(message = "cannot be blank")
	@PositiveOrZero
	private int amountPaid;
	@Pattern(regexp = "^[A-Z]{1,10}$", message = "character limit exceeded")
	private String modeofPayment;
	@Pattern(regexp = "^[A-Z]{1,8}$", message = "character limit exceeded")
	private String orderStatus;
	@PositiveOrZero
	private int quantity;
	
	
	
	
	
	
	public Order( int orderId,
			 String orderDate,
			 int customerId,
			 int amountPaid,
			 String modeofPayment,
			 String orderStatus, int quantity) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.amountPaid = amountPaid;
		this.modeofPayment = modeofPayment;
		this.orderStatus = orderStatus;
		this.quantity = quantity;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}
	public String getModeofPayment() {
		return modeofPayment;
	}
	public void setModeofPayment(String modeofPayment) {
		this.modeofPayment = modeofPayment;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}








