package com.example.demo.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ApiResponse;
import com.example.demo.model.AuthToken;
import com.example.demo.model.LoginUser;
import com.example.demo.model.User;
import com.example.demo.service.NotificationService;
import com.example.demo.service.UserService;

import lombok.AllArgsConstructor;

@CrossOrigin(origins="*")
@RequestMapping("/token")
@RestController
@AllArgsConstructor
public class AuthenticationController {
	
	
	private final UserService userService;
	private final NotificationService notificationService;
	
	
	@PostMapping("/login")
	public ApiResponse<AuthToken> register(@RequestBody LoginUser loginUser){
		
		User user=userService.findByUserName(loginUser.getUserName());
		
		if(user.getPassword().equals(loginUser.getPassword())) {
			String userType=user.getUserType();
			int userId=user.getEmployeeId();
			String token=UUID.randomUUID().toString();
			
			if(userType.toLowerCase().equals("admin")) {
				return new ApiResponse<>(200,"Login successful",new AuthToken(token,userType,userId));
			}
			else if(userType.toLowerCase().equals("manager")) {
				return new ApiResponse<>(202,"Login successful",new AuthToken(token, userType,userId));
			}
			else {
				return new ApiResponse<>(201,"Login successful",new AuthToken(token, userType,userId));
			}
		}
		else {
			return new ApiResponse<>(HttpStatus.NOT_FOUND.value(),"Invalid credentials",null);
		}
		
	}
	
	
	@RequestMapping("/send-email")
	public ResponseEntity<?> signUpSuccess(@RequestBody LoginUser user) {
		
		User userObj=new User();
		userObj=userService.findByUserName(user.getUserName());
		
		if(userObj!=null) {
			User curUser=new User();
			curUser.setUserName(user.getUserName());
			String password=user.getUserName()+"8783*";
			StringBuilder sb=new StringBuilder(password);  
			String hashedPassword=sb.reverse().toString();
			
			curUser.setPassword(password);
			userObj.setPassword(hashedPassword);
			userService.saveUser(userObj);
			
			try {
				notificationService.sendNotification(curUser);
				return ResponseEntity.status(HttpStatus.OK).body("Success");
				
			} catch(MailException e) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
			}
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
			
		}
			
	}

}
