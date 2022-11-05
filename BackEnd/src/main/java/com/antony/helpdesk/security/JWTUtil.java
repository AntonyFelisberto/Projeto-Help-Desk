package com.antony.helpdesk.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Date;

@Component
public class JWTUtil {
    @Value("${jwt.expiration}")
    private Long expirationTime;

    @Value("${jwt.secret}")
    private String secretKey;

    public String generateToken(String email){
        Key hmacKey = new SecretKeySpec(secretKey.getBytes(),SignatureAlgorithm.HS512.getJcaName());

        String jwtToken = Jwts.builder()
                .setSubject(email)
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(hmacKey)
                .compact();

        return jwtToken;
    }

}
