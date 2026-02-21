package com.az.tehsilly.springsecurityl1.entity;

import com.az.tehsilly.springsecurityl1.constants.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Table(name = "users")
public class AuthEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @Column(nullable = false, unique = true)
    String username;

    @Column(nullable = false, unique = true)
    String email;


    @Column(nullable = false)
    String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    Role role;


    @Builder.Default
    @Column(nullable = false)
    boolean enabled = true;
}
