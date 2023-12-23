package com.example.Beautyproducts.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pId;	
private int userId;
@Column(length=20)
private String paymentMode;
@Column(length=20)
private int totalPrice;
public int getpId() {

	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getPaymentMode() {
	return paymentMode;
}
public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}
public int getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(int totalPrice) {
	this.totalPrice = totalPrice;
}
@Override
public String toString() {
	return "Payment [pId=" + pId + ", userId=" + userId + ", paymentMode=" + paymentMode + ", totalPrice=" + totalPrice
			+ "]";
}

}
