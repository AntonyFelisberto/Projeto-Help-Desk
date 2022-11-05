package com.antony.helpdesk.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTUtil {
    @Value("${jwt.expiration}")
    private Long expirationTime;

    @Value("${jwt.secret}")
    private String secretKey;

    public String generateToken(String email){
        return Jwts.builder()
                .setSubject(email)
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(SignatureAlgorithm.HS512,secretKey.getBytes())
                .compact();
    }

//    SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS512);

//    public String generateToken(String email){
//        return Jwts.builder()
//                .setSubject(email)
//                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
//                .signWith(key)
//                .compact();
//    }

}
