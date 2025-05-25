package com.activiza.backend.Activiza.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String email;

    // Getters y setters (o usa Lombok si prefieres)
}
