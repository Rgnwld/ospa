package com.ospa.auth.service;

import com.ospa.auth.entity.SecPerfil;
import com.ospa.auth.entity.SecUser;
import com.ospa.auth.mapper.SecUserMapper;
import com.ospa.auth.dto.SecUserCreateDTO;
import com.ospa.auth.dto.SecUserDTO;
import com.ospa.auth.repository.SecPerfilRepository;
import com.ospa.auth.repository.SecUserRepository;
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

        if (userRepository.existsByEmail(dto.getUsrLogin())) {
            throw new IllegalArgumentException("Login já cadastrado");
        }

        SecUser user = new SecUser();
        user.setUsrLogin(dto.getUsrLogin());
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

    @Transactional(readOnly = true)
    public SecUserDTO login(String username, String password) {
        SecUser user = userRepository.login(username, password)
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));

        if (!passwordEncoder.matches(password, user.getSenha())) {
            throw new IllegalArgumentException("Senha incorreta");
        }

        return userMapper.toDTO(user);
    }

}
