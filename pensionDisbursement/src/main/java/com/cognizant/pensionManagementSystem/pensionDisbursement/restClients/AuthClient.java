package com.cognizant.pensionManagementSystem.pensionDisbursement.restClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.pensionManagementSystem.pensionDisbursement.model.AuthResponse;

/**
 * To access Authorization Microservice
 */
@FeignClient(name = "authorization-service")
public interface AuthClient {

	@GetMapping("/validate")
	public AuthResponse getValidity(@RequestHeader("Authorization") String token);

}
