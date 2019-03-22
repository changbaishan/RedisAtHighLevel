package com.jasperdemo.learn.redisStart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductRepository productRepository;
	
	
	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> listAll() {
		List<Product> products = new ArrayList<>();
		this.productRepository.findAll().forEach(products::add);
		return products;
	}

	@Override
	public Product getById(String id) {
		return this.productRepository.findById(id).orElse(null);
	}

	@Override
	public Product save(Product product) {
		this.productRepository.save(product);
		return product;
	}

	@Override
	public void delete(String id) {
		this.productRepository.deleteById(id);

	}

}
