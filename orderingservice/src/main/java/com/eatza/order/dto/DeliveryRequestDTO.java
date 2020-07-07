package com.eatza.order.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class DeliveryRequestDTO {
	
	private Long customerId;
	private Long restaurantId;
}
