package com.ospa.shared.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JwtVerifier {
    public static DecodedJWT verifyToken(String token) {
        Algorithm algorithm = Algorithm.HMAC256("my_super_secret_key");
        
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("my-java-app")
                .build();
                
        // Throws JWTVerificationException if signature or expiration fails
        return verifier.verify(token); 
    }
}
