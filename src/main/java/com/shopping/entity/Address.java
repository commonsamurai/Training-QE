package com.shopping.entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "address")
public class Address {
	
	@Id
	@NotBlank
	private int customerId;
	private int addressId;
	private String country;
	private String state;
	private String pinCode;
	private String addressLine1;
	private String addressLine2;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@CreatedDate
	private Date createdOn;
	@LastModifiedDate
	private Date modifiedOn;
	@LastModifiedBy
	private String modifiedBy;
	
	

}



