package com.ospa.service;

import com.ospa.dto.sec.SecUserCreateDTO;
import com.ospa.dto.sec.SecUserDTO;
import com.ospa.entity.sec.SecPerfil;
import com.ospa.entity.sec.SecUser;
import com.ospa.mapper.sec.SecUserMapper;
import com.ospa.repository.sec.SecPerfilRepository;
import com.ospa.repository.sec.SecUserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class SecUserService {

    private final SecUserRepository userRepository;
    private final SecPerfilRepository perfilRepository;
    private final SecUserMapper userMapper;
    private final BCryptPasswordEncoder passwordEncoder;

    public SecUserService(SecUserRepository userRepository,
                           SecPerfilRepository perfilRepository,
                           SecUserMapper userMapper,
                           BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.perfilRepository = perfilRepository;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public SecUserDTO criar(SecUserCreateDTO dto) {
        if (userRepository.existsByEmail(dto.getEmail())) {
            throw new IllegalArgumentException("Email já cadastrado");
        }

        SecUser user = new SecUser();
        user.setNome(dto.getNome());
        user.setEmail(dto.getEmail());
        user.setSenha(passwordEncoder.encode(dto.getSenha()));
        user.setAtivo(true);

        // Perfil padrão, exemplo
        SecPerfil perfilPadrao = perfilRepository.findByNome("USER")
                .orElseThrow(() -> new IllegalStateException("Perfil padrão não encontrado"));
        user.setPerfis(Set.of(perfilPadrao));

        SecUser salvo = userRepository.save(user);
        return userMapper.toDTO(salvo);
    }

    @Transactional(readOnly = true)
    public SecUserDTO buscarPorId(Long id) {
        SecUser user = userRepository.findByIdWithPerfis(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));
        return userMapper.toDTO(user);
    }
}