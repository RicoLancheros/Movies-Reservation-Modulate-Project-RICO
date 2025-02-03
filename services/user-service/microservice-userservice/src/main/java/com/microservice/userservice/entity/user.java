package com.microservice.userservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users") // Especifica el nombre de la tabla en la base de datos
@Data // Lombok: genera getters, setters, equals, hashCode, toString
@NoArgsConstructor // Lombok: genera constructor sin argumentos
@AllArgsConstructor // Lombok: genera constructor con todos los argumentos
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremento en MySQL
    private Long id;

    @Column(nullable = false, unique = true) // No puede ser nulo y debe ser único
    private String username;

    @Column(nullable = false) // No puede ser nulo
    private String password;

    @Column(nullable = false) // No puede ser nulo
    private String email;

    // Puedes añadir más campos como firstName, lastName, etc., según tu esquema de base de datos
}