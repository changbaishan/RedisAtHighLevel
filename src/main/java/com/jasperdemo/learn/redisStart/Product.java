package com.jasperdemo.learn.redisStart;



import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("products")
public class Product {
	@Id
	private String id;
	private String name;
	private String supplier;
	private float price;
	private String imageUrl;
	private String userFeedback;
	
	
	public Product() {
		super();
	}
	
	
	
	
	public Product(String name, String supplier, float price, String imageUrl, String userFeedback) {
		super();
		this.name = name;
		this.supplier = supplier;
		this.price = price;
		this.imageUrl = imageUrl;
		this.userFeedback = userFeedback;
	}




	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getUserFeedback() {
		return userFeedback;
	}
	public void setUserFeedback(String userFeedback) {
		this.userFeedback = userFeedback;
	}
	

}
