package com.cognizant.pensionManagementSystem.processPension.restClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.pensionManagementSystem.processPension.model.AuthResponse;

/**
 * to access Authorization microservice
 * 
 */
@FeignClient(name = "authorization-service")
public interface AuthClient {

	@GetMapping("/validate")
	public AuthResponse getValidity(@RequestHeader("Authorization") String token);

}
