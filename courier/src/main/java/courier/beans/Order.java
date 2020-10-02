package courier.beans;

import java.util.Date;

public class Order {
	
	private int orderId;
	private int customerId;
	private Date orderDate;
	private String recipientName;
	private String recipientAddr;
	private int recipientCity;
	private float courierWeight;
	private String courierStatus;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientAddr() {
		return recipientAddr;
	}
	public void setRecipientAddr(String recipientAddr) {
		this.recipientAddr = recipientAddr;
	}
	public int getRecipientCity() {
		return recipientCity;
	}
	public void setRecipientCity(int recipientCity) {
		this.recipientCity = recipientCity;
	}
	public float getCourierWeight() {
		return courierWeight;
	}
	public void setCourierWeight(float courierWeight) {
		this.courierWeight = courierWeight;
	}
	public String getCourierStatus() {
		return courierStatus;
	}
	public void setCourierStatus(String courierStatus) {
		this.courierStatus = courierStatus;
	}
	
	
	
}
