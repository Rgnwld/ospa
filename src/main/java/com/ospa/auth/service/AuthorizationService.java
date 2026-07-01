package com.ospa.auth.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ospa.auth.entity.SecUser;
import com.ospa.auth.repository.SecUserRepository;

@Service
public class AuthorizationService implements UserDetailsService {
    
    private final SecUserRepository secUserRepository;

    AuthorizationService(SecUserRepository secUserRepository) {
        this.secUserRepository = secUserRepository;
    }

    @Override
    public SecUser loadUserByUsername(String email) throws UsernameNotFoundException {
        return secUserRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

}
