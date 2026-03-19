package com.nexus.model;

public class User {
    private final String username;
    private final String email;

    public User(String username, String email) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username não pode ser vazio.");
        }

        //Verifica se o email nao e nulo
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email não pode ser vazio.");
        }

        //Verifica se o email esta na forma correta texto@texto.extensao
        //Caso não esteja, ele lança uma exceção 
        String regex = "^[\\w.-]+@[\\w.-]+\\.\\w+$";
        if (!email.matches(regex)) {
            throw new IllegalArgumentException("Email inválido. Deve ser na forma 'texto@texto.extensao");
        }

        this.username = username;
        this.email = email;
    }

    public String consultEmail() {
        return email;
    }

    public String consultUsername() {
        return username;
    }

    public long calculateWorkload() {
        return 0; 
    }
}