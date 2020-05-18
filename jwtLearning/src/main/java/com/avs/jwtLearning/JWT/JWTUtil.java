package com.avs.jwtLearning.JWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTUtil {

    private String sKey = "my_key_!!";

    public String generateToken(String username) {
        return createToken(username);
    }

    private String createToken(String userName) {
        Map<String, Object> claims = new HashMap<>();
        return Jwts.builder().setClaims(claims)
                      .setSubject(userName)
                      .setIssuedAt(new Date(System.currentTimeMillis()))
                      .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                      .signWith(SignatureAlgorithm.HS256, sKey)
                      .compact();
    }

    public Claims extractClaims(String token, String myKey) {
        return Jwts.parser().setSigningKey(myKey).parseClaimsJws(token).getBody();
    }
}