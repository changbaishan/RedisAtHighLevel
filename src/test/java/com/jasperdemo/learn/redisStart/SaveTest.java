package com.jasperdemo.learn.redisStart;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SaveTest {
	@Autowired
	private ProductRepository repository;
	
	private String myname = "A test product";
	
	private String mysupplier = "A test supplier";
	
	private float myprice = 100f;
	
	private String myimageUrl = "http://test.com/example.jpg";
	
	private String myuserFeedback = "test userFeedback";

	@Test
	public void test() {
		Product product = new Product(myname, mysupplier, myprice, myimageUrl, myuserFeedback);
		Product saved = repository.save(product);
		
		Assert.assertNotNull(saved.getId());
		Assert.assertEquals("Name ",myname, saved.getName());
		Assert.assertEquals("Supplier ", mysupplier, saved.getSupplier());
		Assert.assertEquals("Price ",myprice, saved.getPrice());
		Assert.assertEquals("Name ",myimageUrl, saved.getImageUrl());
		Assert.assertEquals("Feedback ", myuserFeedback, saved.getUserFeedback());
	}

}
