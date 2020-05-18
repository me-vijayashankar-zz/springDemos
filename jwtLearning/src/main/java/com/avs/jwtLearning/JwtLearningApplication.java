package com.avs.jwtLearning;

import com.avs.jwtLearning.JWT.JWTUtil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.jsonwebtoken.Claims;

@SpringBootApplication
public class JwtLearningApplication {

	public static void main(final String[] args) {
		SpringApplication.run(JwtLearningApplication.class, args);

		JWTUtil objJwtUtil =new JWTUtil();
		String token = objJwtUtil.generateToken("vijay");
		System.out.println(token);
		Claims claims= objJwtUtil.extractClaims(token,"my_key_!!"); 
		System.out.println(claims.getSubject());
		System.out.println(claims.getExpiration());
		System.out.println(claims.getIssuedAt());
		// System.out.println(claims.getSubject());
		// System.out.println(token);
	}

}
