package com.jasperdemo.learn.redisStart;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	private ProductService productService;

	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping({ "/product/list", "/product" })
	public List<Product> listProducts() {
		
		return productService.listAll();
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public Product saveOrUpdateProduct(@Valid Product product, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return product;
		}

		Product savedProduct = productService.save(product);

		return savedProduct;
	}
	
    @RequestMapping("/product/show/{id}")
    public Product getProduct(@PathVariable String id){
        return productService.getById(id);
    }
    
    @RequestMapping("/remove/{id}") 
    public List<Product> remove(@PathVariable String id) {
    	productService.delete(id);
    	return productService.listAll();
    }
}
