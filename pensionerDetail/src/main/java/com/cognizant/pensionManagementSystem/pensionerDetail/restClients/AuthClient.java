package com.cognizant.pensionManagementSystem.pensionerDetail.restClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.pensionManagementSystem.pensionerDetail.model.AuthResponse;

/**
 * To access Authorization microservice
 * 
 */
@FeignClient(name = "authorization-service")
public interface AuthClient {

	@GetMapping("/validate")
	public AuthResponse getValidity(@RequestHeader("Authorization") String token);

}
