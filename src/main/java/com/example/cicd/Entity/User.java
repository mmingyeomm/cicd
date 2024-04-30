package com.example.cicd.Entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String username;

    private String password;

}
