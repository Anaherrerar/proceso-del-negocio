package com.proyecto.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class user {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id

        private long id;

        @Column(nullable = false, unique = true, length = 50)
        private String email;

        @Column(nullable = false, length = 64)
        private String password;

        @Column(name = "first_name", nullable = false, length = 100)
        private String firstName;

        @Column(name = "last_name", nullable = false, length = 100)
        private String lastName;


}