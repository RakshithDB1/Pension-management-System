package com.cognizant.pensionManagementSystem.authorization.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Table(name = "userdata")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
	//User Id
	@Id
	@Column(name = "userId")
	private String userid;
	//User Password
	@Column(name = "userPassword")
	private String upassword;
	//User Name
	@Column(name = "userName")
	private String uname;
	//Authoriation Token
	private String authToken;

	

}
