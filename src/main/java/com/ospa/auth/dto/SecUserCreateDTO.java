package com.ospa.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SecUserCreateDTO {

    @NotBlank(message = "Login é obrigatório")
    @Size(max = 100)
    private String usrLogin;

    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email inválido")
    @Size(max = 100)
    private String email;

    @NotBlank(message = "Senha é obrigatória")
    @Size(min = 3, max = 100, message = "Senha deve ter entre 3 e 100 caracteres")
    private String senha;

    public SecUserCreateDTO() {}

    public String getUsrLogin() { return usrLogin; }
    public void setUsrLogin(String usrLogin) { this.usrLogin = usrLogin; }

    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email;}

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}