package com.shopping.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.shopping.model.Item;

@FeignClient(name="shopping-item-service")
@RibbonClient(name="shopping-item-service")
public interface ItemServiceClient {
	
	@GetMapping(value= "/items/{name}")
    public Item getItem(@PathVariable(name= "name") String name);

}
