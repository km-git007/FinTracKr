package com.fintrackr.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId; // Clerk User ID

    private String name;
    private double balance;
    private boolean isDefault; // Indicates default account

    public Account(String userId, String name, double balance, boolean isDefault) {
        this.userId = userId;
        this.name = name;
        this.balance = balance;
        this.isDefault = isDefault;
    }
}
