package com.eatza.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.eatza.order.model.DeliveryRequestDto;

@FeignClient("DELIVERY-SERVICE")
public interface DeliveryServiceClient {

	  @PostMapping(value="/generateDelivery")
	    Object getdelivery(@RequestBody DeliveryRequestDto order);
	 
}
