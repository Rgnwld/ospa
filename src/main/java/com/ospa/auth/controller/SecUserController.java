package com.ospa.auth.controller;

import com.ospa.auth.dto.SecUserCreateDTO;
import com.ospa.auth.dto.SecUserDTO;
import com.ospa.auth.service.SecUserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/usuarios")
public class SecUserController {

    private final SecUserService userService;

    public SecUserController(SecUserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<SecUserDTO> criar(@Valid @RequestBody SecUserCreateDTO dto) {
        SecUserDTO criado = userService.criar(dto);
        return ResponseEntity
                .created(URI.create("/api/usuarios/" + criado.getId()))
                .body(criado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SecUserDTO> buscarPorId(@PathVariable Long id) {
        SecUserDTO usuario = userService.buscarPorId(id);
        return ResponseEntity.ok(usuario);
    }
}