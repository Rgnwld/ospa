package com.ospa.shared.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import java.util.Date;

public class JwtProvider {
    public static String createToken(String username) {
        // Use a secure, long string secret key in production
        Algorithm algorithm = Algorithm.HMAC256("my_super_secret_key"); 
        
        return JWT.create()
                .withIssuer("my-java-app")
                .withSubject(username)
                .withClaim("role", "ADMIN")
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + 3600000)) // 1 hour expiration
                .sign(algorithm);
    }
}
