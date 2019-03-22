package com.jasperdemo.learn.redisStart;

import java.util.List;

public interface ProductService {
	
	List<Product> listAll();
	
	Product getById(String id);
	
	Product save(Product product);
	
	void delete(String id);
}
